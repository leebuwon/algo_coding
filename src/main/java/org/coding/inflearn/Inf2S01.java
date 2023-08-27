package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inf2S01 {
    public static void main(String[] args) throws IOException {
        Inf2S01 T = new Inf2S01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)){
            System.out.println(x + " ");
        }

    }

    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(arr[0]);

        for (int i = 1; i < n; i++){
            int temp = arr[i];
            if (temp > arr[i - 1]){
                arrList.add(arr[i]);
            }
        }

        return arrList;
    }


}
