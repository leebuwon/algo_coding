package org.coding.lv1.p161989;

import java.util.Arrays;

public class P161989 {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 6};
        int[] arr = {2, 3, 4};
//        int[] arr = {1, 4, 7};
//        int[] arr = {1, 3};
        new Solution().solution(8, 4, arr);
    }
}


class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        Arrays.sort(section);

        if (mEqualN(m, n) == 1){
            answer++;
            return answer;
        }

        int sum = 0;
        for (int i = 0; i < section.length; i++){
            if (answer == 0){
                sum = section[i];
                answer++;
            }
            if (sum + m <= section[i]){
                sum = section[i];
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }

    private int mEqualN(int m, int n) {
        if (m == n) {
            return 1;
        }
        return 0;
    }
}