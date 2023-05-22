package org.coding.lv0.p181903;

public class P181903 {
    public static void main(String[] args) {
        new Solution().solution(3, 1, "qjnwezgrpirldywt");
    }
}

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] split = code.split("");
        for(int i = r; i < split.length; i += q){
            answer += split[i];
        }

        System.out.println(answer);
        return answer;
    }
}