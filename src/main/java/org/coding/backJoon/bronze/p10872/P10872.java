package org.coding.backJoon.bronze.p10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = factorial(n);
        System.out.println(count);
    }

    private static int factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
}
