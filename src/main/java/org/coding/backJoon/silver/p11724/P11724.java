package org.coding.backJoon.silver.p11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11724 {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        solution();
    }

    private static void solution() {
        int count = 0;
        for (int i = 1; i <= n; i++){
            List<Integer> node = graph.get(i);
            for (int num : node) {
                if (!visited[num]){
                    bfs(num);
                    count++;
                }
            }

            // 무방향 체크 (외딴 노드)
            if (node.isEmpty()){
                count++;
            }
        }

        System.out.println(count);
    }

    private static void bfs(int num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num);

        while (!queue.isEmpty()) {
            int poll = queue.poll();

            List<Integer> node = graph.get(poll);
            for (int nearNode : node) {
                if (!visited[nearNode]) {
                    queue.add(nearNode);
                    visited[nearNode] = true;
                }
            }
        }
    }
}
