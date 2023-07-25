package org.coding.lv1.p12932;

import java.util.Arrays;


public class P12932 {
    public static void main(String[] args) {
        new Solution().solution(12345);
    }
}

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] split = str.split("");

        int[] answer = new int[split.length];
        for (int i = split.length - 1; i >= 0; i--) {
            answer[i] = Integer.parseInt(split[split.length - 1 - i]);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}