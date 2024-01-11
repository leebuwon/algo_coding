package org.coding.backJoon.silver.p9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            solution(n);
        }
    }

    private static void solution(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        if (n >= 2){
            dp[2] = 2;
        }

        for (int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i -3];
        }

        System.out.println(dp[n]);
    }
}