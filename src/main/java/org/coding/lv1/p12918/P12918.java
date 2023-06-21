package org.coding.lv1.p12918;

public class P12918 {
    public static void main(String[] args) {
        new Solution().solution("3235");
    }
}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6){
            answer = true;
        } else {
            answer = false;
            System.out.println(answer);
            return answer;
        }

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++){
            if (chars[i] >= '0' && chars[i] <= '9'){
                answer = true;
            }  else{
                answer = false;
                return answer;
            }
        }

        System.out.println(answer);
        return answer;
    }
}