package org.coding.backJoon.silver.p7795;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int[] arr1 = new int[A];
            int[] arr2 = new int[B];

            st = new StringTokenizer(br.readLine());
            for (int a = 0; a < arr1.length; a++){
                arr1[a] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int b = 0; b < arr2.length; b++){
                arr2[b] = Integer.parseInt(st.nextToken());
            }

            solution(arr1, arr2);
        }

    }

    private static void solution(int[] arr1, int[] arr2) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int num : arr1){
            int start = 0;
            int end = arr2.length - 1;
            while (start <= end){
                if (num > arr2[start]){
                    count++;
                }

                if (start != end){
                    if (num > arr2[end]) {
                        count++;
                        end--;
                    }
                }

                start++;
            }
        }

        sb.append(count).append("\n");
        System.out.print(sb.toString());
    }
}
