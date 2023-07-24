package org.coding.lv1.p12982;

import java.util.Arrays;

public class P12982 {
    public static void main(String[] args) {
//        int[] d = {1,3,2,5,4};
        int[] d = {2,2,3,3};
        new Solution().solution(d, 10);
    }
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        // 배열을 오름차순으로 정렬
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++){
            sum += d[i];

            // 예산이 모든 부서에게 주지 못할 경우
            if (sum > budget){
                answer = 0;
                answer += i;
                break;
            // 예산이 모든 부서에 줄 수 있을 경우
            } else {
                answer = 0;
                answer += d.length;
            }
        }

        System.out.println(answer);
        return answer;
    }
}