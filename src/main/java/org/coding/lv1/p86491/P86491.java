package org.coding.lv1.p86491;

import java.util.Arrays;

public class P86491 {
    public static void main(String[] args) {
//        int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] size = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        new Solution().solution(size);
    }
}

class Solution {
    public int solution(int[][] sizes) {

        int answer = 0;

        int leftMax = 0;
        int rightMax = 0;
        int temp = 0;

        // 상수님 해답
//        for (int i = 0; i < sizes.length; i++){
//            Arrays.sort(sizes[i]);
//        }

        for (int i = 0; i < sizes.length; i++){
            if (sizes[i][0] > sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            if (sizes[i][0] > leftMax){
                leftMax = sizes[i][0];
            }

            if (sizes[i][1] > rightMax){
                rightMax = sizes[i][1];
            }
        }

        answer = leftMax * rightMax;

        return answer;
    }
}