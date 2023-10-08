package org.coding.backJoon.silver.p1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 선택 정렬
 */
public class P1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        solution(num);
    }

    private static void solution(String num) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[num.length()];

        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        for (int i = 0; i < arr.length - 1; i++){
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
