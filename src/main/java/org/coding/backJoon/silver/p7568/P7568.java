package org.coding.backJoon.silver.p7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(arr);
    }

    private static void solution(int[][] arr) {
        int[] personRank = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            int rank = 1;
            for (int[] person : arr) {
                if (arr[i][0] < person[0] && arr[i][1] < person[1]) {
                    rank++;
                }
            }
            personRank[i] = rank;
        }

        for (int i = 0; i < personRank.length; i++){
            System.out.print(personRank[i] + " ");
        }

    }
}
