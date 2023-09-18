package org.coding.lv1.p64061;

import java.util.Arrays;
import java.util.Stack;

public class P64061 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        new Solution().solution(board, moves);

        // 0 -> 1 -> 1 -> 0 -> 3 -> 0 ->  3 -> 0 -> 2 // 1과 3이 터진다.


        // 4 -> 3 -> 1 -> 1 -> 3 -> 2 -> 4
        // stack : 4 -> ( 3 -> 1 -> 1 -> 3 ) -> 2 -> 4
        // 바뀐 배열 : {{0,0,0,0,0},{0,0,0,0,0},{0,0,5,0,0},{0,2,4,0,2},{0,5,1,3,1}}
    }
}

/**
 * 해설지 보고 풀이
 * col과 i를 반대로 하여 해결하지 못함
 */
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            int col = move - 1;
            int doll = 0;

            for (int i = 0; i < board.length; i++) {
                if (board[i][col] != 0) {
                    doll = board[i][col];
                    System.out.println("doil : " + doll);
                    System.out.println("i 의 인덱스 : " + i);
                    board[i][col] = 0;
                    break;
                }
            }

            if (doll != 0) {
                if (!stack.isEmpty() && stack.peek() == doll) {
                    System.out.println("pop하기전 stack : " + stack);
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(doll);
                }

                System.out.println("stack : " + stack);
            }
        }

        System.out.println(Arrays.deepToString(board));

        return answer;
    }
}