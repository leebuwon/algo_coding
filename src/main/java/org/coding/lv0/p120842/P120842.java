package org.coding.lv0.p120842;

import java.util.Arrays;

public class P120842 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 혼자 힘으로 해결하지 못하여 코드 참조하여 해결

        int[][] answer = new int[num_list.length / n][n];
        int number = 0;

        for (int i = 0; i < num_list.length / n; i++){
            for (int j = 0; j < n; j++){
                answer[i][j] = num_list[number];
                number++;
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}