package org.coding.backJoon.silver.p15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 풀이 참조 (어렵다..)
public class P15650 {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int m;
    static boolean[] visited;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        arr = new int[m];

        dfs(0, 0);

        System.out.println(sb);
    }

    private static void dfs(int depth, int start) {
        if (depth == m){
            Arrays.sort(arr);
            for (int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++){
            if (!visited[i]){
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1, i + 1);
                if (depth != 0 && n != m){
                    visited[i] = false;
                }
            }
        }
    }
}
