package org.coding.backJoon.bronze.p25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int amount = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for(int i = 0; i < arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        solution(amount, arr);
    }

    private static void solution(int amount, int[][] arr) {
        int sum = Arrays.stream(arr)
                .mapToInt(num -> num[0] * num[1])
                .sum();

        if (amount == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
