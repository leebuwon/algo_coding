package org.coding.backJoon.silver.p2217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        Arrays.sort(arr);

        int count = 1;
        for (int i = arr.length - 1; i >= 0; i--){
            arrList.add(arr[i] * count);
            count++;
        }

        arrList.sort(Collections.reverseOrder());

        System.out.println(arrList.get(0));
    }
}