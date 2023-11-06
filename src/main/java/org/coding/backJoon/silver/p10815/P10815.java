package org.coding.backJoon.silver.p10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        int[] arr1 = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, arr1, m, arr2);
    }

    private static void solution(int n, int[] arr1, int m, int[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++){
            map.put(arr2[i], 0);
        }

        for (int num : arr1){
            if (map.containsKey(num)){
                map.put(num, 1);
            }
        }

        for (int num : arr2){
            System.out.print(map.get(num) + " ");
        }

    }
}
