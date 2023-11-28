package org.coding.backJoon.silver.p1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1260 {
    static List<List<Integer>> graph = new ArrayList<>();
    static int n;
    static int m;
    static int k;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);

            // 이 부분이 추가되야한다... 틀린 부분! 참조부분!
            graph.get(b).add(a);
        }

        // List 정렬
        for (int i = 1; i <= n; i++){
            Collections.sort(graph.get(i));
        }

        System.out.println(graph);
        System.out.println(Arrays.toString(visited));

        dfs(k);
        // dfs를 순회하지 못하는 경우 -> 틀린 풀이
//        for (int i = 1; i < visited.length; i++){
//            if (!visited[i]){
//                sb.append(i).append(" ");
//            }
//        }
        System.out.println(sb.toString());

        visited = new boolean[n + 1];
        sb = new StringBuilder();
        bfs(k);
        System.out.println(sb.toString());
    }

    private static void dfs(int idx) {
        visited[idx] = true;
        sb.append(idx).append(" ");
        for (int num : graph.get(idx)){
            if (!visited[num]){
                dfs(num);
            }
        }

    }

    private static void bfs(int idx) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(idx);
        visited[idx] = true;

        while (!queue.isEmpty()){
            int num = queue.poll();
            sb.append(num).append(" ");
            for (int n : graph.get(num)){
                if (!visited[n]){
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }
    }
}
