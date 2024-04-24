package org.coding.backJoon.silver.p1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        solution(str);
    }

    private static void solution(String str) {
        int[] arr = new int[10];

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int num = c - 48;

            if (num == 9) {
                arr[6]++;
            } else {
                arr[num]++;
            }
        }

        arr[6] = (int) Math.ceil(arr[6] / 2.0);

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println(max);
    }
}
