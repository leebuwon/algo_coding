package org.coding.backJoon.bronze.p10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        solution(str);
    }

    private static void solution(String str) {
        int[] alphabet = new int[26];

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int num = c - 97;

            alphabet[num]++;
        }

        for (int num : alphabet) {
            System.out.print(num + " ");
        }
    }
}
