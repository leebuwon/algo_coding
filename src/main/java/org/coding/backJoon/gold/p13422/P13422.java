package org.coding.backJoon.gold.p13422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13422 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 집의 개수
            int m = Integer.parseInt(st.nextToken()); // 털어야 하는 집의 개수
            int k = Integer.parseInt(st.nextToken()); // 최소 돈의 양

            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int j = 0; j < n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            solution(n, m, k, arr);
        }
    }

    private static void solution(int n, int m, int k, int[] arr) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < m; i++){
            sum += arr[i];
        }
        if (sum < k) {
            count++;
        }

        if (n != m){
            for (int i = 1; i < n; i++){
                sum = sum - arr[(i - 1) % n] + arr[(i + m - 1) % n];
                if (sum < k){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
