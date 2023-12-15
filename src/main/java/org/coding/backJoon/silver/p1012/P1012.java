package org.coding.backJoon.silver.p1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1012 {
    static int m;
    static int n;
    static int k;
    static int[][] map;
    static boolean[][] visited;
    static int count;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int test = 0; test < t; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            map = new int[m][n];
            visited = new boolean[m][n];

            count = 0;

            for (int i = 0; i < k; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            solution();
        }
    }

    private static void solution() {
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                if (!visited[i][j]){
                    if (map[i][j] == 1){
                        count++;
                        bfs(i, j);
                    }
                }
            }
        }

        System.out.println(count);
    }

    /**
     * [1, 0, 0, 0, 0, 0, 0, 0],
     * [1, 1, 0, 0, 0, 0, 0, 0],
     * [0, 0, 0, 0, 1, 0, 0, 0],
     * [0, 0, 0, 0, 1, 0, 0, 0],
     * [0, 0, 1, 1, 0, 1, 0, 0],
     * [0, 0, 0, 0, 0, 0, 0, 0],
     * [0, 0, 0, 0, 0, 0, 0, 0],
     * [0, 0, 0, 0, 1, 1, 1, 0],
     * [0, 0, 0, 0, 1, 1, 1, 0],
     * [0, 0, 0, 0, 1, 1, 1, 0]
     */
    private static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()){
            int[] cabbage = queue.poll();


            for (int i = 0; i < 4; i++){
                int x = cabbage[0] + dx[i];
                int y = cabbage[1] + dy[i];

                if (x >= 0 && y >= 0 && x < m && y < n && !visited[x][y] && map[x][y] == 1){
                    queue.add(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }
    }
}
