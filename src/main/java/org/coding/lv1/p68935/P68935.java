package org.coding.lv1.p68935;

import java.util.ArrayList;
import java.util.List;

public class P68935 {
    public static void main(String[] args) {
        new Solution().solution(45);
    }
}

class Solution {
    public int solution(int n) {
        StringBuilder ternary = new StringBuilder();

        // 10진수 -> 3진법
        while (n > 0) {
            ternary.append(n % 3);
            n /= 3;
        }

        int answer = 0;
        int power = 0;

        // 3진법 -> 10진수
        for (int i = ternary.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(ternary.charAt(i));
            answer += digit * Math.pow(3, power);
            power++;
        }

        return answer;
    }
}