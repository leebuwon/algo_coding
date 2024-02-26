package org.coding.lv3.p43238;

import java.util.Arrays;

public class P43238 {
    public static void main(String[] args) {
        int[] times = {7, 10};
        new Solution().solution(6, times);
    }
}

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);

        long min = 1; // 가장 작은 값으로 세팅
        long max = (long) n * times[times.length - 1]; // 가장 오래 시간이 걸릴 경우

        while (min <= max) {
            long middle = (min + max) / 2;
            long sum = 0;

            for (int time : times) {
                sum += middle / time;
            }

            if (sum < n){
                min = middle + 1;
            } else {
                max = middle - 1;
                answer = middle;
            }

        }

        System.out.println(answer);

        return answer;
    }
}