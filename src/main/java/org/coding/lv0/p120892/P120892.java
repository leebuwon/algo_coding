package org.coding.lv0.p120892;

public class P120892 {
    public static void main(String[] args) {
        new Solution().solution("dfjardstddetckdaccccdegk", 4);
    }
}

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = 0; i < cipher.length(); i++){
            if ((i + 1) % code == 0){
                char c = cipher.charAt(i);
                answer += c;
            }
        }
        return answer;
    }
}