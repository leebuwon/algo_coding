package org.coding.backJoon.bronze.p2750;

import java.io.IOException;
import java.util.Scanner;

public class P2750 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        solution(n, arr);
    }

    private static void solution(int n, int[] arr) {
        // 5 2 3 4 1
        //
        for (int i = 0; i < n - 1; i++){
            int temp = 0;
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
