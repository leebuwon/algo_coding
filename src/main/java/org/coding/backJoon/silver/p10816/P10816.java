package org.coding.backJoon.silver.p10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, arr, m, arr2);
    }

    private static void solution(int n, int[] arr, int m, int[] arr2) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < m; i++){
            maps.put(arr2[i], 0);
        }

        for (int i = 0; i < n; i++){
            if (maps.containsKey(arr[i])){
                maps.put(arr[i], maps.getOrDefault(arr[i], 0) + 1);
            }
        }
        /**
         * 시간 초과
         */
//        for (int i = 0; i < m; i++){
//            if (maps.containsKey(arr2[i])){
//                System.out.print(maps.get(arr2[i]) + " ");
//            }
//        }

        StringBuilder sb = new StringBuilder();
        for (int num : arr2){
            sb.append(maps.get(num)).append(' ');
        }

        System.out.println(sb.toString());
    }
}