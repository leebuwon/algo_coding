package org.coding.backJoon.bronze.p2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        int minDivisor = minDivisor(num1, num2);
        System.out.println(minDivisor);
        int maxMultiple = maxMultiple(num1, num2);
        System.out.println(maxMultiple);
    }

    // 최소공배수
    private static int maxMultiple(int num1, int num2) {
        return num1 * num2 / minDivisor(num1, num2);
    }

    // 최대공약수
    private static int minDivisor(int num1, int num2) {
        int max = 0;

        for (int i = 1; i <= num1 && i <= num2; i++){
            if (num1 % i == 0 && num2 % i == 0){
                max = i;
            }
        }

        return max;
    }
}
