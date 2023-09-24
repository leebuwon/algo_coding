package org.coding.backJoon.bronze.p2562;

import java.io.IOException;
import java.util.Scanner;

public class P2562 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int[] arr = { in.nextInt(), in.nextInt(), in.nextInt(),
                in.nextInt(), in.nextInt(), in.nextInt(),
                in.nextInt(), in.nextInt(), in.nextInt() };

        solution(arr);
    }

    private static void solution(int[] arr) {

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
                idx = i + 1;
            }
        }

        System.out.println(max + "\n" + idx);
    }
}
