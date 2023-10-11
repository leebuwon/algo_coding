package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf7S03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution(n);
    }

    private static void solution(int n) {
        System.out.println(recursive(n));
    }

    private static int recursive(int n) {
        if (n == 0){
            return 1;
        } else {
            return n * recursive(n - 1);
        }

    }
}
