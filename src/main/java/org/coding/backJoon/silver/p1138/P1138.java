package org.coding.backJoon.silver.p1138;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        int[] personArr = new int[arr.length];


        for(int i = 0; i < arr.length; i++){
            int position = arr[i];
            int count = 0;

            for (int j = 0; j < personArr.length; j++){
                if (personArr[j] == 0){
                    if (count == position){
                        personArr[j] = i + 1;
                        break;
                    }
                    count++;
                }
            }
        }


        for (int num : personArr) {
            System.out.print(num + " ");
        }
    }
}
