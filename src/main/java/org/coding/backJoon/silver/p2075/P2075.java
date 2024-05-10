package org.coding.backJoon.silver.p2075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(n, arr);
    }

    private static void solution(int n, int[][] arr) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                pq.add(arr[i][j]);
            }
        }

        int count = 1;
        while (count <= n){
            answer = pq.poll();
            count++;
        }

        System.out.println(answer);
    }
}
