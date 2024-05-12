package org.coding.backJoon.silver.p26091;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P26091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr, m);
    }

    private static void solution(int[] arr, int m) {
        int answer = 0;
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            if (arr[start] + arr[end] >= m){
                start++;
                end--;
                answer++;
            } else {
                start++;
            }
        }


        System.out.println(answer);
    }
}
