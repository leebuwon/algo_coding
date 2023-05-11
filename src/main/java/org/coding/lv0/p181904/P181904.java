package org.coding.lv0.p181904;

public class P181904 {
    public static void main(String[] args) {
        new Solution().solution("ihrhbakrfpndopljhygc", 4, 2);

    }
}

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] split = my_string.split("");

        for (int i = c - 1; i < split.length; i += m){
            answer += split[i];
        }

        System.out.println(answer);
        return answer;
    }
}