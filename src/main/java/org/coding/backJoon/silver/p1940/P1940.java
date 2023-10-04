package org.coding.backJoon.silver.p1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;

        int startIdx = 0;
        int endIdx = arr.length - 1;

        Arrays.sort(arr);

        while (startIdx < endIdx){
            if (arr[startIdx] + arr[endIdx] == m){
                answer++;
                startIdx++;
                endIdx--;
            } else if (arr[startIdx] + arr[endIdx] > m) {
                endIdx--;
            } else {
                startIdx++;
            }
        }
/*
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j){
                    continue;
                }

                if (m == arr[i] + arr[j]){
                    answer++;
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
        }
*/
        return answer;
    }
}
