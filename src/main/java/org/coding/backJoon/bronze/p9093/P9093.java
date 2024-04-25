package org.coding.backJoon.bronze.p9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            String str = br.readLine();

            solution(str);
        }
    }

    private static void solution(String str) {
        String[] split = str.split(" ");


        StringBuilder reverseStr = new StringBuilder();
        for (String s : split) {
            StringBuilder sb = new StringBuilder(s);
            String reverse = sb.reverse().toString();

            reverseStr.append(reverse).append(" ");
        }

        System.out.println(reverseStr);
    }
}
