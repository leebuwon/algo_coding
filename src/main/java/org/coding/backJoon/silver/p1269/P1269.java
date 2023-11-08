package org.coding.backJoon.silver.p1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, arr1, m, arr2);
    }

    private static void solution(int n, int[] arr1, int m, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++){
            map.put(arr1[i], 0);
        }

        int count = 0;
        for (int i = 0; i < m; i++){
            if (map.containsKey(arr2[i])){
                count++;
            }
        }

        System.out.println((arr1.length - count) + (arr2.length - count));
    }
}
