package org.coding.lv0.p120848;

public class P120848 {
    public static void main(String[] args) {
//        new Solution().solution(3628800);
        new Solution().solution(7);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        int i = 1;

        while (factorial < n) {
            i++;
            factorial *= i;
        }

        if (factorial == n) {
            answer = i;
        } else {
            answer = i - 1;
        }

        return answer;
    }
}