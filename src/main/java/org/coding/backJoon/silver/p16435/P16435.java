package org.coding.backJoon.silver.p16435;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int snake = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        solution(arr, snake);
    }

    private static void solution(int[] arr, int snake) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            if (snake >= arr[i]) {
                snake++;
            }
        }

        System.out.println(snake);
    }
}
