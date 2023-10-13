package org.coding.lv0.p120808;

import java.util.Arrays;

public class P120808 {
    public static void main(String[] args) {
//        new Solution().solution(1, 2, 3, 4);
//        new Solution().solution(9, 2, 1, 3);
        //1, 8, 2, 16
        new Solution().solution(1, 8, 2, 16);
//        new Solution().solution(1, 9, 1, 18);
    }
}


class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        // 최대공약수
        int a = gcd(denom1, denom2);
        // 최대공배수
        int common = denom1 * denom2 / a;

        int num1 = numer1 * (common / denom1);
        int num2 = numer2 * (common / denom2);

        int common2 = num1 + num2;

        // 기약분수 만들기
        int gcdValue = gcd(common, common2);
        answer[0] = common2 / gcdValue;
        answer[1] = common / gcdValue;


        System.out.println(Arrays.toString(answer));

        return answer;
    }

    private int gcd(int denom1, int denom2) {
        while(denom2 != 0){
            int temp = denom2;
            denom2 = denom1 % denom2;
            denom1 = temp;
        }

        return denom1;
    }
}