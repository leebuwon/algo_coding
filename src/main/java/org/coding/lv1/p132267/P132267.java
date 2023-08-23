package org.coding.lv1.p132267;

public class P132267 {
    public static void main(String[] args) {
//        new Solution().solution(2, 1, 20);
        new Solution().solution(3, 2, 20);
    }
}


class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int sum = 0;
        int remain = 0;

        while (n >= a) {
            remain += n % a;
            int newCoke = (n / a) * b;
            sum += newCoke;

            if (remain >= a) {
                sum += b;
                remain -= a;
            }

            n = newCoke + remain;
            remain = 0;
        }

        answer = sum;

        return answer;
    }
}