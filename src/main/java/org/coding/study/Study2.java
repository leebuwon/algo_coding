package org.coding.study;

/**
 * 슬라이딩 원도우
 */
public class Study2 {
    public static int findShortestSubarrayLength(int[] nums, int target) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minLength != Integer.MAX_VALUE) ? minLength : 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 15;
        int result = findShortestSubarrayLength(nums, target);
        System.out.println("가장 짧은 길이: " + result);
    }
}