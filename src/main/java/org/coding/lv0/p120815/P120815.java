package org.coding.lv0.p120815;

public class P120815 {
    public static void main(String[] args) {
        new Solution().solution(30);
    }
}


class Solution {
    public int solution(int n) {
        int answer;
        int pizza = 6;

        while (pizza % n != 0){
            pizza += 6;
        }

        answer = pizza / 6;
        System.out.println(answer);
        return answer;
    }
}