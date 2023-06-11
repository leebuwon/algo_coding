package org.coding.lv1.p12948;

public class P12948 {
    public static void main(String[] args) {
        new Solution().solution("027778888");
    }
}

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] split = phone_number.split("");
        for (int i = 0; i < split.length; i++){
            if (i <= split.length - 5){
                split[i] = "*";
            }
        }
        for (int i = 0; i < split.length; i++){
            answer += split[i];
        }
        System.out.println(answer);
        return answer;
    }
}