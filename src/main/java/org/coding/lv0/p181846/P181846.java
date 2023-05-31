package org.coding.lv0.p181846;

import java.math.BigDecimal;

public class P181846 {
    public static void main(String[] args) {
        new Solution().solution("18446744073709551615", "287346502836570928366");
    }
}

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigDecimal num1 = new BigDecimal(a);
        BigDecimal num2 = new BigDecimal(b);
        BigDecimal result = num1.add(num2);

        answer = result.toString();

        System.out.println(answer);

        return answer;
    }
}