package org.coding.backJoon.bronze.p10813;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P10813 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[28];
        for (int i = 0; i < 28; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        Arrays.sort(arr);

        List<Integer> arrList = new ArrayList<>();

        int count = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i - count - 1] != i) {
                count++;
                arrList.add(i);
            }
        }

        if (count == 0) {
            arrList.add(29);
            arrList.add(30);
        } else if (count == 1) {
            arrList.add(30);
        }

        for (Integer integer : arrList) {
            System.out.println(integer);
        }
    }
}