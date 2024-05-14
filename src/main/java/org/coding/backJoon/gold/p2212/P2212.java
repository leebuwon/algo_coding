package org.coding.backJoon.gold.p2212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(k, arr);
    }

    private static void solution(int k, int[] arr) {
        int answer = 0;

        if (arr.length <= k){
            System.out.println(0);
            return;
        }

        Arrays.sort(arr);
        int[] distance = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++){
            distance[i] = arr[i + 1] - arr[i];
        }

        Arrays.sort(distance);
        for (int i = 0; i < arr.length - k; i++){
            answer += distance[i];
        }

        System.out.println(answer);
    }
}
