package org.coding.lv2.p12953;

public class P12953 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        new Solution().solution(arr);
    }
}

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        // 처음 gcd 값 초기화
        int gcdValue = gcd(arr[0], arr[1]);
        int lcm = lcm(arr[0], arr[1], gcdValue);

        for(int i = 2; i < arr.length; i++){
            gcdValue = gcd(lcm, arr[i]);
            lcm = lcm(lcm, arr[i], gcdValue);
        }

        answer = lcm;

        System.out.println(answer);

        return answer;
    }

    // 최대 공약수
    private int gcd(int n, int m){
        while(m != 0){
            int temp = m;
            m = n % m;
            n = temp;
        }

        return n;
    }

    // 최소 공배수
    private int lcm(int n, int m, int gcd){
        return n * m / gcd;
    }
}