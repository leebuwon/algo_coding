package org.coding.backJoon.bronze.p2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 9;
        int y = 9;

        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(arr);
    }

    private static void solution(int[][] arr) {

        int max = Integer.MIN_VALUE;

        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
