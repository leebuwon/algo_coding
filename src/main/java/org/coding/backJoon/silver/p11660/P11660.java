package org.coding.backJoon.silver.p11660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11660 {
    static int[][] arr;
    static int[][] sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        sum = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                // 구간 합을 구해준다.
                sum[i][j] = arr[i][j] + sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1];
            }
        }

        /**
         * // 2 3 3 4
         * // sum[3][4] - sum[3][2] - sum[1][4] + sum[1][2]
         * // 42 - 15 - 10 - 3
         * [0, 0, 0, 0, 0],
         * [0, 1, 3, 6, 10],
         * [0, 3, 8, 15, 24],
         * [0, 6, 15, 27, 42],
         * [0, 10, 24, 42, 64]
         */
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
//            System.out.println("sum[x2][y2] : " + sum[x2][y2]);
//            System.out.println("sum[x2][y-1] : " + sum[x2][y1 -1]);
//            System.out.println("sum[x1-1][y2] : " + sum[x1 - 1][y2]);
//            System.out.println("sum[x1-1][y1-1] : " + sum[x1 -1][y1-1]);
            System.out.println(sum[x2][y2] - sum[x2][y1 - 1] - sum[x1 - 1][y2] + sum[x1 - 1][y1 - 1]);

            // 틀린풀이 (당연한 시간 초과)
//            solution(x1 - 1, y1 - 1, x2 - 1, y2 - 1);
        }
    }
}

    /**
     * x1 : 2 / y1 : 2 / x2 : 3 / y2 : 4
     * [1, 2, 3, 4],
     * [2, 3, 4, 5],
     * [3, 4, 5, 6],
     * [4, 5, 6, 7]
     */
//    private static void solution(int x1, int y1, int x2, int y2) {
//
//        int sum = 0;
//        for (int i = x1; i <= x2; i++){
//
//            for (int j = y1; j <= y2; j++){
//                sum += arr[i][j];
//            }
//        }
//
//        System.out.println(sum);
//    }
//}
