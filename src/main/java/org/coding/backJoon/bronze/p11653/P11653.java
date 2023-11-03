package org.coding.backJoon.bronze.p11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.BatchUpdateException;

/**
 * 소인수 분해
 */
public class P11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        solution(n);
    }

    private static void solution(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++){
            while (n % i == 0){
                System.out.println(i);
                n /= i;
            }
        }

        if (n != 1){
            System.out.println(n);
        }
    }
}
