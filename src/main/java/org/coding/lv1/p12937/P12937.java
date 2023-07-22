package org.coding.lv1.p12937;

import java.util.IllegalFormatCodePointException;

public class P12937 {
    public static void main(String[] args) {
        new Solution().solution(4);
    }
}

class Solution {
    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }

        System.out.println(answer);
        return answer;
    }
}