package org.coding.lv0.p120911;

import java.util.Arrays;

public class P120911 {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str = my_string.toLowerCase();
        char[] cArr = str.toCharArray();

        Arrays.sort(cArr);
        answer = new StringBuilder(new String(cArr)).toString();

        return answer;
    }
}