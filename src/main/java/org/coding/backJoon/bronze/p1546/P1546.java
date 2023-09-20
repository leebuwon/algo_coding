package org.coding.backJoon.bronze.p1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println(solution(n, arr));
    }

    /**
     * 책 풀이
     */
    private static double solution(int n, int[] arr) {
        double answer = 0;

        long max = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            answer += arr[i];
        }

        // 한번에 계산하는 방식
        return answer * 100 / max / n;
    }

//    private static double solution(int n, int[] arr) {
//        double answer = 0;
//
//        int maxScore = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++){
//            if(maxScore < arr[i]){
//                maxScore = arr[i];
//            }
//        }
//
//        double[] doubles = new double[n];
//        for (int i = 0; i < n; i++){
//            doubles[i] = (double) arr[i] / maxScore * 100;
//            answer += doubles[i];
//        }
//
//        return answer;
//    }
}
