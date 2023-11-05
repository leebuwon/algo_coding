package org.coding.backJoon.silver.p11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(n, arr);
    }


    private static void solution(int n, int[][] arr){

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]){
                return o1[0] - o2[0];
            }

            return o1[1] - o2[1];
        });

        for (int i = 0; i < n; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
