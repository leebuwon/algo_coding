package org.coding.backJoon.bronze.p10870;

import javax.accessibility.AccessibleRelation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10870 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];
        solution(n);
    }

    private static void solution(int n) {
//        System.out.println(recursive(n));

        System.out.println(recursive(n));
    }

    private static int recursive(int n) {
        if (n == 0){
            return dp[n] = 0;
        } else if (n == 1){
            return dp[n] = 1;
        }else {
            return dp[n] = recursive(n - 1) + dp[n - 2];
        }

//        if (n == 1){
//            return dp[n] = 1;
//        } else if (n == 2){
//            return dp[n] = 1;
//        } else {
//            return dp[n] = recursive(n - 2) + recursive(n - 1);
//        }
    }
}
