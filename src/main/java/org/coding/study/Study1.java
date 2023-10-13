package org.coding.study;

import java.util.Arrays;

public class Study1 {
    public static void main(String[] args) {
        int[][] arr = {{11, 3}, {5, 9}, {4, 7}};
        new Solution().solution(arr);
    }
}

/**
 * 2차원 배열 회전 시키기
 */
class Solution{
    public void solution(int[][] arr) {
        int[][] arr2 = new int[arr[0].length][arr.length]; // 행과 열의 위치를 바까준다.
        for (int i = 0; i < arr[0].length; i++){
            for (int j = 0; j < arr.length; j++){
                arr2[i][j] = arr[arr.length - 1 - j][i];
            }
        }

        // 90도가 회전된 것을 확인할 수 있다.

        /**
         * [11, 3],
         * [5, 9],
         * [4, 7]
         */
        System.out.println(Arrays.deepToString(arr));

        /**
         * [4, 5, 11],
         * [7, 9, 3]
         */
        System.out.println(Arrays.deepToString(arr2));
    }
}

