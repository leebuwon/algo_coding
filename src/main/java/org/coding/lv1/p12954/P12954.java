package org.coding.lv1.p12954;

import java.util.Arrays;

public class P12954 {
    public static void main(String[] args) {
        new Solution().solution(2, 5);
    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i++){
            answer[i - 1] += (long) x * i;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}