package org.coding.backJoon.bronze.p1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            solution(num1, num2);
        }

    }

    private static void solution(int num1, int num2) {
        int gcd = gcd(num1, num2);
        int answer = num1 * num2 / gcd;

        System.out.println(answer);
    }

    private static int gcd(int num1, int num2) {
        while (num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }
}
