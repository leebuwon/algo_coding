package org.coding.backJoon.silver.p1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1929 {
    static boolean[] isPrime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        solution(n, m);
    }

    private static void solution(int n, int m) {
        isPrime = new boolean[m + 1];
        prime();

        for (int i = n; i <= m; i++) {
            if (!isPrime[i]){
                System.out.println(i);
            }
        }
    }

    private static void prime() {
        isPrime[0] = true;
        isPrime[1] = true;


        for (int i = 2; i < Math.sqrt(isPrime.length); i++){
            if (isPrime[i]){
                continue;
            }
            for (int j = i * i; j < isPrime.length; j += i){
                isPrime[j] = true;
            }
        }
    }
}
