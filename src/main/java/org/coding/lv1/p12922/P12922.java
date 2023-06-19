package org.coding.lv1.p12922;

public class P12922 {
    public static void main(String[] args) {
        new Solution().solution(3);
    }
}

class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }
}