package org.coding.backJoon.silver.p4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4948 {
    static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            int n = Integer.parseInt(br.readLine());
            int m = n * 2;

            if (n == 0){
                break;
            }

            solution(n, m);
        }
    }

    private static void solution(int n, int m) {
        prime = new boolean[123456 * 2 + 1];
        // 246912

        isPrime();

        int count = 0;
        for (int i = n + 1; i <= m; i++){
            if (!prime[i]){
                count++;
            }
        }
        System.out.println(count);
    }

    private static void isPrime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++){
            if (prime[i]){
                continue;
            }
            for (int j = i * i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}
