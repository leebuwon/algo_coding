package org.coding.backJoon.silver.p2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2839 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution(n);
    }

    /**
     * dp 풀이 참조
     */
    private static void solution(int n) {
        dp = new int[n + 1];

        if (n >= 3){
            dp[3] = 1;
        }

        if (n >= 5){
            dp[5] = 1;
        }

        for (int i = 6; i <= n; i++){
            if (i % 5 == 0){
                dp[i] = dp[i - 5] + 1;
            } else if (i % 3 == 0){
                dp[i] = dp[i - 3] + 1;
            } else {
                if (dp[i - 3] != 0 && dp[i - 5] != 0){
                    dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
                }
            }
        }

        if (dp[n] == 0){
            System.out.println("-1");
            return;
        }

        System.out.println(Arrays.toString(dp));

        System.out.println(dp[n]);
    }

//    private static void solution2(int n) {
//        int count = 0;
//
//        while (n != 0){
//            if (n % 5 == 0){
//                count += n / 5;
//                n %= 5;
//            } else {
//                // 값이 나오지 않을 경우
//                if (n < 3){
//                    break;
//                }
//                n -= 3;
//                count++;
//            }
//        }
//
//        if (n != 0){
//            count = -1;
//        }
//
//        System.out.println(count);
//    }
}
