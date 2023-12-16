package org.coding.backJoon.silver.p3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());

        solution(arr, x);
    }

    private static void solution(int[] arr, int x) {
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        int count = 0;
        while (start < end){
            if (x == arr[start] + arr[end]){
                count++;
            }

            if (x < arr[start] + arr[end]){
                end--;
            } else {
                start++;
            }

        }

        System.out.println(count);
    }
}

//9
//5 15 7 14 9 1 2 3 11
//13