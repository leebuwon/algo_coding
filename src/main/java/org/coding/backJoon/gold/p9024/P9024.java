package org.coding.backJoon.gold.p9024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P9024 {
    static int min;
    static int k;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            min = Integer.MAX_VALUE;
            count = 0;

            solution(arr);
        }
    }

    private static void solution(int[] arr) {
        Arrays.sort(arr);

        binarySearch(arr);
    }

    private static void binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (min >= Math.abs(sum - k)) {
                if (min != Math.abs(sum - k)) {
                    count = 0;
                }
                min = Math.abs(sum - k);
                count++;
            }

            if (sum > k) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(count);
    }
}
