package org.coding.lv0.p120890;

import java.util.Arrays;

public class P120890 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        new Solution().solution(arr, 1);
    }
}

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        Arrays.sort(array);

        // left와 right 선언
        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= n) {
                left = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                right = array[i];
                break;
            }
        }

        if (left == Integer.MIN_VALUE) {
            answer = right;
        } else if (n - left <= right - n) {
            answer = left;
        } else if (n - left > right - n){
            answer = right;
        } else if (n - left == right - n){
            answer = left;
        }

        System.out.println(answer);
        return answer;
    }
}