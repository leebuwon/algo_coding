package org.coding.backJoon.bronze.p2798;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2798 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, m, arr);
    }

    private static void solution(int n, int m, int[] arr){
        long answer = 0;

        long max = 0;
        for (int i = 0; i < arr.length - 2; i++){
            for (int j = i + 1; j < arr.length - 1; j++){
                for (int k = j + 1; k < arr.length; k++){

                    long sum = arr[i] + arr[j] + arr[k];
                    if (sum <= m){
                        if (max < sum){
                            max = sum;
                        }
                    }
                }
            }
        }

        answer = max;

        System.out.println(answer);
    }
}