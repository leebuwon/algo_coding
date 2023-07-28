package org.coding.lv1.p12934;

public class P12934 {
    public static void main(String[] args) {
        new Solution().solution(121);
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        for (long i = 1; i <= n; i++){
            if (i * i == n){
                i += 1;
                answer = i * i;
                break;
            } else {
                answer = -1;
            }
        }

        System.out.println(answer);
        return answer;
    }
}