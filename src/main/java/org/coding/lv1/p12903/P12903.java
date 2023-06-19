package org.coding.lv1.p12903;

public class P12903 {
    public static void main(String[] args) {
        new Solution().solution("abcde");
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");

        if (split.length % 2 == 0){
            for (int i = split.length / 2 - 1; i < split.length / 2 + 1; i++){
                answer += split[i];
            }
        } else {
            for (int i = split.length / 2; i < split.length / 2 + 1; i++){
                answer += split[i];
            }
        }

        System.out.println(answer);
        return answer;
    }
}