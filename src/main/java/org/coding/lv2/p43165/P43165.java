package org.coding.lv2.p43165;

import java.util.ArrayList;
import java.util.List;

public class P43165 {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 1, 1, 1};
        int[] arr = {4, 1, 2, 1};
        new Solution().solution(arr, 4);
    }
}

class Solution {
    public int solution(int[] numbers, int target) {
        List<Integer> result =  new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(numbers[0]);
        list.add(-numbers[0]);
        int answer=0;
        // 1, list = {4, -4}
        // 2, list = {5, 3, -3, -5}
        // 3, list = {7, 3, 5, 1, -1, -5, -3, -7}
        for (int i = 1; i < numbers.length; i++) {
            for(int num : list) {
                System.out.println(list);
                result.add(num + numbers[i]);
                result.add(num - numbers[i]);
            }
            list.clear();
            list.addAll(result);
            System.out.println("최종 list " + list);
            result = new ArrayList<>();
        }
        for(int m : list){
            if(m==target) answer++;
        }

        System.out.println(answer);

        return answer;
    }
}

//class Solution {
//    static int[][] dp;
//
//    public int solution(int[] numbers, int target) {
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        int m = sum * 2 + 1;
//        dp = new int[numbers.length + 1][m];
//        dp[0][sum] = 1;
//
//        for (int i = 1; i <= numbers.length; i++) {
//            for (int j = 0; j < m; j++) {
//                if (dp[i - 1][j] > 0) {
//                    dp[i][j + numbers[i - 1]] += dp[i - 1][j];
//                    dp[i][j - numbers[i - 1]] += dp[i - 1][j];
//                }
//            }
//        }
//
//        System.out.println(Arrays.deepToString(dp));
//
//        return dp[numbers.length][target + sum];
//    }
//}