package org.coding.backJoon.silver.p11650;

import java.io.*;
import java.util.*;

public class P11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(n, arr);
    }

    private static void solution(int n, int[][] arr) {

        // 2차원 배열로 정렬하면서 0번쨰 인덱스가 같으면 1번쨰 인덱스로 비교
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        /**
         * 람다 형식
         */
//        Arrays.sort(arr, (o1, o2) -> {
//            if (o1[0] == o2[0]){
//                return o1[1] - o2[1];
//            }
//            return o1[0] - o2[0];
//        });


                 Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        for (int i = 0; i < n; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/**
 *         아래 3개는 같은 코드다.
 *         Arrays.sort(arr, new Comparator<int[]>() {
 *             @Override
 *             public int compare(int[] o1, int[] o2) {
 *                 return o1[0] - o2[0];
 *             }
 *         });
 *
 *         Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);
 *
 *         Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
 */