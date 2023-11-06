package org.coding.backJoon.bronze.p2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        int[] answer = new int[2];
        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (i == 2){
                answer[1] = arr[i];
            }
            sum += arr[i];
        }

        answer[0] = sum / 5;

        for (int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}


