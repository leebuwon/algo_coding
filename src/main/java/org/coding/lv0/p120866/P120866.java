package org.coding.lv0.p120866;

import java.util.Arrays;

public class P120866 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        new Solution().solution(board);

    }
}


/**
 * {0, 0, 0, 0, 0},
 * {0, 0, 0, 0, 0},
 * {0, 0, 0, 0, 0},
 * {0, 0, 1, 0, 0},
 * {0, 0, 0, 0, 0}
 */
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] direction = {{1, 0}, {1, -1}, {1, 1}, {-1, 0}, {-1, -1}, {-1, 1}, {0, -1}, {0, 1}};

        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    for (int[] dir : direction) {
                        int row = i + dir[0];
                        int col = j + dir[1];
                        if (row >= 0 && row < board.length && col >= 0 && col < board[i].length && board[row][col] != 1) {
                            board[row][col] = 2;
                        }
                    }
                }
            }
        }
        /**
         * [0, 0, 0, 0, 0],
         * [0, 0, 0, 0, 0],
         * [0, 2, 2, 2, 0],
         * [0, 2, 1, 2, 0],
         * [0, 2, 2, 2, 0]
         */

        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }

        return answer;
    }
}