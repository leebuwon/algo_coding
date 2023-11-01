package org.coding.backJoon.bronze.p5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int start =  Integer.parseInt(st.nextToken());
            int end =  Integer.parseInt(st.nextToken());

            int temp = arr[start - 1];
            arr[start - 1] = arr[end - 1];
            arr[end - 1] = temp;
        }

        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }
}
