package org.coding.lv3.p43162;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P43162 {
    public static void main(String[] args) {
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0,0,1}};
        new Solution().solution(3, computers);
    }
}

class Solution {
    public static boolean[][] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[computers.length][computers[0].length];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (visited[i][j] == false && computers[i][j] == 1){
                    bfs(i, j, computers);
                    answer++;
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    private void bfs(int startX, int startY, int[][] computers) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int y = current[1];

            for (int i = 0; i < computers.length; i++) {
                if (!visited[y][i] && computers[y][i] == 1) {
                    queue.add(new int[]{y, i});
                    visited[y][i] = true;
                }
            }
        }
    }
}