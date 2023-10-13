package org.coding.lv2.p12939;

public class P12939 {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        String[] str = s.split(" ");
        for(int i = 0; i < str.length; i++){
            if (max < Integer.parseInt(str[i])){
                max = Integer.parseInt(str[i]);
            }

            if (min > Integer.parseInt(str[i])){
                min = Integer.parseInt(str[i]);
            }
        }
        answer.append(String.valueOf(min)).append(" ").append(max);

        return answer.toString();
    }
}