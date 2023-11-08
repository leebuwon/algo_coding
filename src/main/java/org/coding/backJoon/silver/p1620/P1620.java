package org.coding.backJoon.silver.p1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr1 = new String[n];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = br.readLine();
        }

        String[] arr2 = new String[m];
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = br.readLine();
        }

        solution(n, arr1, m, arr2);
    }

    private static void solution(int n, String[] arr1, int m, String[] arr2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++){
            map.put(arr1[i], i + 1);
        }


        for (int i = 0; i < m; i++){
            if (map.containsKey(arr2[i])){
                System.out.println(map.get(arr2[i]));

            }else {
                System.out.println(arr1[Integer.parseInt(arr2[i]) - 1]);
            }
        }
    }
}
