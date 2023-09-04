package org.coding.lv1.p12977;

public class P12977 {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4};
        int[] nums = {1,2,7,6,4};
//        int[] nums = {1, 2, 3};
        new Solution().solution(nums);

        // 1 + 2 + 3
        // 1 + 2 + 4
        // 1 + 3 + 4
        // 2 + 3 + 4

        // 1 + 2 + 7
        // 1 + 2 + 6
        // 1 + 2 + 4
        // 1 + 7 + 6
        // 1 + 7 + 4
        // 1 + 6 + 4
        // 2 + 7 + 6
        // 2 + 7 + 4
        // 2 + 6 + 4
        // 7 + 6 + 4
    }
}


class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int num = 0;
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    num = nums[i] + nums[j] + nums[k];

                    if (isPrime(num)) {
                        answer++;
                    }
                }
            }
        }


        System.out.println(answer);
        return answer;
    }

    // 에라토스테네스의 체
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}