package org.coding.lv1.p82612;

public class P82612 {
    public static void main(String[] args) {
        new Solution().solution(3, 30, 4);
    }
}

class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        long sum = 0;

        for (int i = 1; i <= count; i++){
            sum += price * i;
        }


        if (sum < money){
            return answer;
        } else {
            answer = sum - money;
        }

        System.out.println(answer);
        return answer;
    }
}