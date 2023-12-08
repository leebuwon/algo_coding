package org.coding.backJoon.silver.p14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14501 {
    static int max = Integer.MIN_VALUE;
    static int arr[][];
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][2];
        for (int i = 1; i < arr.length; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(arr, 1, 0);

        System.out.println(max);
    }

    /**
     * [0, 0],
     * [3, 10],
     * [5, 20],
     * [1, 10],
     * [1, 20],
     * [2, 15],
     * [4, 40],
     * [2, 200]
     */
    private static void dfs(int[][] arr, int day, int totalValue) {
        if (day > n) {
            max = Math.max(max, totalValue);
            return;
        }

        dfs(arr, day + 1, totalValue);

        if (day + arr[day][0] - 1 <= n) {
            dfs(arr, day + arr[day][0], totalValue + arr[day][1]);
        }
    }
}
