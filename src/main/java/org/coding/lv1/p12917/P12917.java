package org.coding.lv1.p12917;

public class P12917 {
    public static void main(String[] args) {
        new Solution().solution("Zbcdefg");
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j < chars.length; j++){
                if (chars[i] > chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }

        answer = new String(chars);
        System.out.println(answer);
        return answer;
    }
}