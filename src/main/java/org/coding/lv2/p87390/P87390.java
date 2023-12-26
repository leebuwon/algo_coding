package org.coding.lv2.p87390;

public class P87390 {
    public static void main(String[] args) {
        int n = 3;
        int left = 2;
        int right = 5;
        new Solution().solution(n, left, right);
    }
}

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] arr = new int[(int) (right - left + 1)];

        int index = 0;
        for (long i = left; i <= right; i++) {
            int row = (int) (i / n);
            int col = (int) (i % n);
            arr[index++] = Math.max(row + 1, col + 1);
        }

        return arr;
    }
}