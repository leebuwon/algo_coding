package org.coding.backJoon.silver.p12847;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12847 {
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

        solution(n, m, arr);
    }

    private static void solution(int n, int m, int[] arr) {
        long max = Integer.MIN_VALUE;
        long left = 0;
        long sum = 0;

        int count = 0;
        for (int i = 0; i < n; i++){
            count++;
            sum += arr[i];

            while (count == m){
                max = Math.max(max, sum);
                sum -= arr[(int) left];
                left++;
                count--;
            }
        }

        System.out.println(max);
    }
}
