package org.coding.backJoon.silver.p2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatCodePointException;
import java.util.StringTokenizer;

public class P2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(m, arr);
    }

    private static void solution(int m, int[] arr) {
        int start = 0;

        int count = 0;
        while (start < arr.length){
            int sum = arr[start];
            int end = start + 1;
            if (sum == m){
                start++;
                count++;
                continue;
            }
            while (sum < m && end < arr.length){
                sum += arr[end];

                if (sum == m){
                    count++;
                    break;
                }

                if (sum > m){
                    break;
                }

                end++;
            }

            start++;
        }

        System.out.println(count);
    }
}
