package org.coding.backJoon.silver.p1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        solution(x);
    }

    private static void solution(int x) {
        int n = 64;

        int count = 0;
        boolean flag = true;
        while (flag){
            if (n > x){
                n /= 2;
            } else {
                count++;
                if (x == n){
                    flag = false;
                    continue;
                }
                x -= n;
            }
        }

        System.out.println(count);
    }
}
