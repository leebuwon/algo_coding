package org.coding.backJoon.silver.p10867;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (!arrList.contains(arr[i])){
                arrList.add(arr[i]);
            }
        }

        Collections.sort(arrList);
        for (int i = 0; i < arrList.size(); i++){
            System.out.print(arrList.get(i) + " ");
        }
    }
}
