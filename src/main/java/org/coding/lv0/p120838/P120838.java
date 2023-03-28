package org.coding.lv0.p120838;

import java.util.Arrays;

public class P120838 {
    public static void main(String[] args) {
        new Solution().solution(".... . .-.. .-.. ---");
    }
}

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] str = letter.split(" ");
        System.out.println(Arrays.toString(str));

        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            for (int j = 0; j < morse.length; j++) {
                if (s.equals(morse[j])) {
                    char c = (char)(j + 97);
                    answer += String.valueOf(c);
                }
            }
        }

        System.out.println(answer);
        return answer;
    }
}