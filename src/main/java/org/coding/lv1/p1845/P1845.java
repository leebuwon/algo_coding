package org.coding.lv1.p1845;

import java.util.HashSet;
import java.util.Set;

public class P1845 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        new Solution().solution(nums);
    }
}


class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> arr = new HashSet<>();

        for (int i = 0; i< nums.length; i++){
            arr.add(nums[i]);
        }

        if (nums.length / 2 < arr.size()){
            answer += nums.length / 2;
        } else {
            answer += arr.size();
        }


        return answer;
    }
}