package org.coding.lv1.p250125;

public class P250125 {
    public static void main(String[] args) {
        String[][] board = {
                {"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}
        };

        new Solution().solution(board, 1, 1);
    }
}

class Solution {
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];

        for (int i = 0; i < 4; i++){
            int x = h + dx[i];
            int y = w + dy[i];

            if (x >= 0 && y >= 0 && x < board.length && y < board[0].length && color.equals(board[x][y])){
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }
}