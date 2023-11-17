package org.coding.backJoon.bronze.p24723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution(n);
    }

    private static void solution(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++){
            answer *= 2;
        }
        System.out.println(answer);
    }
}
