package org.coding.lv1.p12912;

public class P12912 {
    public static void main(String[] args) {
        new Solution().solution(5,3);
    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b){
            for (int i = a; i <=b; i++){
                answer += i;
            }
        }
        for (int i = b; i <=a; i++){
            answer += i;
        }

        System.out.println(answer);
        return answer;
    }
}