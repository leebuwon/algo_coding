package org.coding.backJoon.silver.p16953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        solution(a, b);
    }
    private static void solution(long a, long b) {
        int count = 1;

        while (a < b){
            long lastDigit = b % 10;

            if (lastDigit == 1){
                count++;
                b = b / 10;
            } else {
                if (b % 2 == 0){
                    count++;
                    b = b / 2;
                } else {
                    break;
                }
            }
        }

        if (a == b){
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
