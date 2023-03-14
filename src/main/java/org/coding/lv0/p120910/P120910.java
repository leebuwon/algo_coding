package org.coding.lv0.p120910;

public class P120910 {
    public static void main(String[] args) {
        new Solution().solution(7, 15);
    }
}

class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++){
            answer *= 2;
            System.out.println(answer);
        }
        return answer;
    }
}
