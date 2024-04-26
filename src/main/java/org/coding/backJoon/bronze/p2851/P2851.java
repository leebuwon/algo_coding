package org.coding.backJoon.bronze.p2851;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        int answer = 0;
        int hundred = 100;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : arr) {
            sum += num;

            int abs = Math.abs(hundred - sum);
            if (abs == 0) {
                answer = sum;
                break;
            } else {

                if (abs <= min){
                    min = abs;
                    if (max < sum){
                        max = sum;
                        answer = sum;
                        continue;
                    }

                    answer = sum;
                }
            }
        }

        System.out.println(answer);
    }
}
