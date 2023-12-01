package org.coding.backJoon.silver.p1946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][2];
            for (int j = 0; j < arr.length; j++){
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < arr[j].length; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            solution(arr);
        }
    }

    private static void solution(int[][] arr) {
        // 서류 심사 1등을 기준으로 잡기 -> 면접또한 낮으면 탈락
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        int success = 1;
        int interviewScore = arr[0][1];
        for (int i = 1; i < arr.length; i++){
            if (interviewScore > arr[i][1]){
                success++;
                interviewScore = arr[i][1];
            }
        }

        System.out.println(success);
    }
}
