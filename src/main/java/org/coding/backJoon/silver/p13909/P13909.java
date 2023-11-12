package org.coding.backJoon.silver.p13909;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P13909 {
    static boolean[] isPrime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution(n);
    }

    /**
     * 6
     * 1 2 3 4 5 6
     * 1 1 1 1 1 1 ( 1 )
     * 1 0 1 0 1 0 ( 2 )
     * 1 0 0 0 1 1 ( 3 )
     * 1 0 0 1 1 1 ( 4 )
     * 1 0 0 1 0 1 ( 5 )
     * 1 0 0 1 0 0 ( 6 )
     */
    private static void solution(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++){
            count++;
        }

        System.out.println(count);
    }



    /**
     * 시간 초과
     */
//    private static void solution(int n) {
//        isPrime = new boolean[n + 1];
//
//        for (int i = 2; i <= n; i++) {
//            prime(i, n);
//
//        }
//
//        int count = 0;
//        for (int i = 1; i < isPrime.length; i++){
//            if (!isPrime[i]){
//                count++;
//            }
//        }
//
//        System.out.println(count);
//    }
//
//    private static void prime(int start, int end) {
//        int num = start;
//        for (int i = start; i <= end; i += num){
//            if (isPrime[i]){
//                isPrime[i] = false;
//            } else {
//                isPrime[i] = true;
//            }
//        }
//
//    }
}