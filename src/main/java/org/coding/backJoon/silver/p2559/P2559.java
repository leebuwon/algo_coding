package org.coding.backJoon.silver.p2559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr, m);
    }

    private static void solution(int[] arr, int m) {
        int start = 0;

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];

            if (i == m - 1){
                max = sum;
            }

            if (i >= m){
                sum -= arr[start];
                start++;
                max = Math.max(max, sum);
            }
        }

        System.out.println(max);
    }
}
