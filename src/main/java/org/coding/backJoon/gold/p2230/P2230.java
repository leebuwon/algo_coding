package org.coding.backJoon.gold.p2230;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2230 {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        solution(arr ,m);
    }

    private static void solution(int[] arr, int m) {
        Arrays.sort(arr);

        int start = 0;
        int end = 0;

        while (end < arr.length) {
            int gap = arr[end] - arr[start];

            if (gap < m) {
                end++;
            } else if (gap > m) {
                min = Math.min(gap, min);
                start++;
            } else {
                min = m;
                break;
            }
        }

        System.out.println(min);
    }
}
