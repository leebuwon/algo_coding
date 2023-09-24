package org.coding.backJoon.bronze.p10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int find = Integer.parseInt(br.readLine());

        System.out.println(solution(n, arr, find));
    }

    private static int solution(int n, int[] arr, int find) {
        int answer = 0;

        for (int i = 0; i < n; i++){
            if (find == arr[i]){
                answer++;
            }
        }

        return answer;
    }
}
