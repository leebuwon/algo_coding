package org.coding.lv1.p12931;

public class P12931 {
    public static void main(String[] args) {
        new Solution().solution(123);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0){
            answer += n % 10;
            n /= 10;
        }

        System.out.println(answer);
        return answer;
    }
}