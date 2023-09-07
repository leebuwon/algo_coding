package org.coding.lv1.p136798;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P136798 {
    public static void main(String[] args) {
        new Solution().solution(10, 3, 2);
    }
}


class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        List<Integer> arrList = new ArrayList<>();
        for (int i = 1; i <= number; i++){
            int sum = measure(i);
            arrList.add(sum);
        }

        int[] gisadan = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++){
            gisadan[i] = arrList.get(i);
        }

        for (int i = 0; i < gisadan.length; i++){
            if (gisadan[i] > limit){
                gisadan[i] = power;
            }
            answer += gisadan[i];
        }

        return answer;
    }

    private int measure(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                // n의 약수 i를 찾으면
                if (n / i == i) {
                    sum++; // i가 제곱수일 경우 중복으로 세지 않음
                } else {
                    sum += 2; // i와 n/i 둘 다 약수일 경우
                }
            }
        }
        return sum;
    }
}