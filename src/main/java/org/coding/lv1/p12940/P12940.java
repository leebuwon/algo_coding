package org.coding.lv1.p12940;

public class P12940 {
    public static void main(String[] args) {
        new Solution().solution(3, 12);
    }
}

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 최대공약수
        int a = gcd(n, m);
        // 최대공배수
        int b = n * m / a;

        answer[0] += a;
        answer[1] += b;

        return answer;
    }

    private int gcd(int n, int m) {
        while (m != 0){
            int temp = m;
            m = n % m;
            n = temp;
        }

        return n;
    }
}