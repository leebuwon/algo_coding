package org.coding.lv0.p120816;

public class P120816 {
    public static void main(String[] args) {
        new Solution().solution(7, 10);
        new Solution().solution(4, 12);
    }
}

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;

        int pizza = 1;
        int temp = slice;
        while(temp < n){
            pizza++;
            temp = slice * pizza;
        }

        answer = pizza;
        System.out.println(answer);
        return answer;
    }
}