package org.coding.backJoon.silver.p2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2606 {
    static int n;
    static int m;
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        visited = new boolean[n + 1];
        for (int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        solution(1);
    }

    /**
     * 5
     * 4
     * 1 2
     * 2 4
     * 3 5
     * 4 5
     */
    private static void solution(int virus) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(virus);

        int count = 0;
        visited[virus] = true;
        // [[], [2, 5], [3], [], [7], [2, 6], [], []]

        // 양쪽 노드 설정
        // [[], [2, 5], [1, 3, 5], [2], [7], [1, 2, 6], [5], [4]]
        while (!queue.isEmpty()){
            int virusCom = queue.poll();

            for (int computer : graph.get(virusCom)) {
                if (!visited[computer]){
                    visited[computer] = true;
                    queue.add(computer);
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
