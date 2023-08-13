package org.coding.lv1.p12926;


public class P12926 {
    public static void main(String[] args) {
        new Solution().solution("a B z", 2);
    }
}

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (c >= 'A' && c <= 'Z'){
                c = (char) (((c - 'A' + n) % 26) + 'A');
                answer += c;
            }
            if (c >= 'a' && c <= 'z'){
                c = (char) (((c - 'a' + n) % 26) + 'a');
                answer += c;
            } if (c == ' '){
                answer += ' ';
            }

        }

        System.out.println(answer);
        return answer;
    }
}