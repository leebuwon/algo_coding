package org.coding.lv0.p120876;

import java.util.Arrays;

public class P120876 {
    public static void main(String[] args) {
//        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
        new Solution().solution(lines);
    }
}

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[400];

        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0] + 100;
            int end = lines[i][1] + 100;
            for (int j = start; j < end; j++) {
                arr[j]++;
            }
        }


        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 1){
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }
}