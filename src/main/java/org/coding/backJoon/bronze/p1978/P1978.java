package org.coding.backJoon.bronze.p1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr);

    }

    private static void solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            int prime = primeNumber(arr[i]);
            answer += prime;
        }

        System.out.println(answer);
    }

    private static int primeNumber(int num) {
        if (num == 1){
            return 0;
        }

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return 0;
            }
        }

        return 1;
    }
}
