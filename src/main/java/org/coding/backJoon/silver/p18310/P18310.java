package org.coding.backJoon.silver.p18310;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class P18310 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        // 정답 코드
//        Arrays.sort(arr);
//        if (arr.length % 2 == 0){
//            System.out.println(arr[arr.length / 2 - 1]);
//        } else {
//            System.out.println(arr[arr.length / 2]);
//        }


        // 82% 오류
        int answer = 0;

        Arrays.sort(arr);

        if (arr.length == 1){
            System.out.println(arr[0]);
        } else {

            long min = Integer.MAX_VALUE;
            int middle = arr[arr.length / 2 - 1];

            int count = 0;
            while (count != 2) {
                count++;
                long sum = 0;
                for (int num : arr) {
                    sum += Math.abs(num - middle);
                }

                if (sum < min) {
                    min = sum;
                    answer = middle;
                }

                middle++;
            }
            System.out.println(answer);
        }
    }
}
