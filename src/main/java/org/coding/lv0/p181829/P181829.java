package org.coding.lv0.p181829;

public class P181829 {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};
        new Solution().solution(arr, 2);
    }
}

class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (i + j <= k){
                    answer += board[i][j];
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}