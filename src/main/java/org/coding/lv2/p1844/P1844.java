package org.coding.lv2.p1844;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P1844 {
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};
        new Solution().solution(maps);
    }
}


class Solution {
    static int[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public int solution(int[][] maps) {
        int answer = 0;
        visited = new int[maps.length][maps[0].length];
        bfs(maps);
        if (visited[maps.length - 1][maps[0].length - 1] == 0){
            answer = -1;
        } else {
            answer = visited[maps.length - 1][maps[0].length - 1];
        }

        return answer;
    }

    private void bfs(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        visited[0][0] = 1;

        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            if (x == maps.length - 1 && y == maps[0].length - 1) {
                return;
            }

            for (int i = 0; i < 4; i++){
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if (nextX >= 0 && nextY >= 0 && nextX < maps.length && nextY < maps[0].length && visited[nextX][nextY] == 0 && maps[nextX][nextY] == 1) {
                    queue.add(new int[]{nextX, nextY});
                    visited[nextX][nextY] = visited[x][y] + 1;
                }
            }
        }
    }
}