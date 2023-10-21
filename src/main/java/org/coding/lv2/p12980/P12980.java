package org.coding.lv2.p12980;

public class P12980 {
    public static void main(String[] args) {
        new Solution().solution(5);
    }
}


class Solution {
    public int solution(int n) {
        int answer = 0;

        /**
         * 2로 나누는 방법
         */
        // while(n != 0){
        //     if(n % 2 == 0){
        //         n = n / 2;
        //     } else {
        //         n -= 1;
        //         answer++;
        //     }
        // }

        /**
         * 이진법으로 변환 후 1을 카운트
         */
        String str = Integer.toBinaryString(n);
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '1'){
                answer++;
            }
        }

        return answer;
    }
}