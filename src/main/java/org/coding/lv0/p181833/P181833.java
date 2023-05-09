package org.coding.lv0.p181833;

public class P181833 {
    public static void main(String[] args) {
        new Solution().solution(3);
    }
}

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j){
                    answer[i][j] += 1;
                }
            }
        }
        return answer;
    }
}