package org.coding.backJoon.bronze.p15439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution(n);
    }

    private static void solution(int n) {
         int answer = n * n - n;

        System.out.println(answer);
    }
}
