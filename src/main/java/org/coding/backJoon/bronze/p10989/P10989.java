package org.coding.backJoon.bronze.p10989;

import java.util.*;
import java.io.*;

public class P10989 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        solution(n, arr);
    }

    private static void solution(int n, int[] arr) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Arrays.sort(arr);

        for (int i = 0; i < n; i++){
            bw.write(Integer.toString(arr[i]));
            bw.newLine();
        }

        bw.close();
    }
}
