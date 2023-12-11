package org.coding.backJoon.silver.p2468;

import javax.imageio.ImageTranscoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2468 {
    static int[][] map;
    static int max = Integer.MIN_VALUE; // waterHigh가 증가할 수 있는 범위
    static int areaMax = Integer.MIN_VALUE; // 해당 지역이 가장 많은 것
    static boolean[][] visited;
    static int n;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, map[i][j]);
            }
        }

        solution();
        System.out.println(areaMax);

    }

    private static void solution() {
        int waterHigh = 0;
        while (waterHigh < max){
            int count = 0;
            visited = new boolean[n][n];
            for(int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if (!visited[i][j] && map[i][j] > waterHigh){
                        bfs(waterHigh, i, j);
                        count++;
                    }
                }
            }
            waterHigh++;
            areaMax = Math.max(areaMax, count);
        }
    }

    // depth보다 높은 곳을 true 값 처리 해준다.
    private static void bfs(int depth, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()){
            int[] s = queue.poll();

            for (int i = 0 ; i < 4; i++){
                int x = dx[i] + s[0];
                int y = dy[i] + s[1];

                if (x >= 0 && y >= 0 && x < n && y < n && !visited[x][y] && map[x][y] > depth){
//                    System.out.println(map[x][y]);
                    queue.add(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }

    }
}

/**
 * [true, true, false, true, false],
 * [true, false, true, true, true],
 * [true, true, true, true, false],
 * [true, false, true, true, true],
 * [true, true, true, false, true]
 */