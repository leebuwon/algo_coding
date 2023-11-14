package org.coding.backJoon.silver.p4963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P4963 {
    static boolean[][] visited;
    static int h;
    static int w;
    static int[] dx = {1, 1, 1, -1, -1, -1, 0, 0};
    static int[] dy = {0, -1, 1, 0, -1, 1, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            int[][] arr = new int[h][w];
            visited = new boolean[h][w];
            for (int i = 0; i < h; i++){
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            if (h == 0 && w == 0){
                break;
            }

            solution(arr);
        }
    }

    private static void solution(int[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == 1){
                    if (!visited[i][j]){
                        answer++;
                        bfs(arr, i, j);
                    }
                }
            }
        }

        System.out.println(answer);
    }

    private static void bfs(int[][] arr, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()){
            int[] s = queue.poll();

            for (int i = 0; i < 8; i++){
                // 사각형 범위로 다 검사
                int num1 = s[0] + dx[i];
                int num2 = s[1] + dy[i];

                /**
                 * [1, 0, 1, 0, 0],
                 * [1, 0, 0, 0, 0],
                 * [1, 0, 1, 0, 1],
                 * [1, 0, 0, 1, 0]
                 */
                if (0 <= num1 && num1 < h && 0 <= num2 && num2 < w && !visited[num1][num2] && arr[num1][num2] == 1){
                    queue.add(new int[]{num1, num2});
                    visited[num1][num2] = true;
                }
            }
        }
    }
}

