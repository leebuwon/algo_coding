package org.coding.backJoon.silver.p17103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P17103 {
    static boolean[] isPrime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());

            solution(num);
        }
    }

    private static void solution(int num) {
        isPrime = new boolean[num + 1];
        prime();

        // 6
        // 2 3 5

        int count = 0;
        for (int i = 0; i <= num; i++) {
            if (!isPrime[i]){
                int minus = num - i;
                if (!isPrime[minus]){
                    count++;
                    isPrime[minus] = true;
                }
            }
        }
        System.out.println(count);
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
