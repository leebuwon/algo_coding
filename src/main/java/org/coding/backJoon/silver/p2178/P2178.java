package org.coding.backJoon.silver.p2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2178 {
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] map;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for (int i = 0; i < n; i++){
            String s = br.readLine();
            for (int j = 0; j < m; j++){
                map[i][j] = s.charAt(j) - '0';
            }
        }

        visited = new boolean[n][m];

        bfs(0, 0);

    }

    private static void bfs(int startX, int startY) {
        Queue<int []> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()){
            int[] current = queue.poll();

            if (current[0] == n - 1 && current[1] == m - 1){
                System.out.println(map[n - 1][m - 1]);
                break;
            }

            for (int i = 0; i < 4; i++){
                int x = current[0] + dx[i];
                int y = current[1] + dy[i];

                if (x >= 0 && x < n && y >= 0 && y < m && map[x][y] == 1 && !visited[x][y]){
                    queue.add(new int[]{x, y});
                    visited[x][y] = true;
                    // 참조 부분 -> 나는 count로 했는데 count로 하면 최단 거리가 나오지 않는다.
                    map[x][y] += map[current[0]][current[1]];
                }
            }
        }
    }
}
