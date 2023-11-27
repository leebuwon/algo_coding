package org.coding.backJoon.silver.p1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        solution(n, arr);
    }

    /**
     * 1, 끝나는 시간을 기준으로 정렬해준다. 만약 끝나는 시간이 같다면 시작시간을 기준으로 정렬해준다.
     * 2, 끝나는 시간보다 시작시간이 길면
     */
    private static void solution(int n, int[][] arr) {
        // 이 비교가 틀렸던 이유는 그냥 짧은 시작시간과 끝나는시간이 짧은 시간으로 해줬기 때문임
//        Arrays.sort(arr, (o1, o2) -> {
//            int num1 = Math.abs(o1[0] - o1[1]);
//            int num2 = Math.abs(o2[0] - o2[1]);
//            return Integer.compare(num1, num2);
//        });

        // 1
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]){
                return o1[0] - o2[0];
            }

            return o1[1] - o2[1];
        });

        int count = 1;
        int endTime = arr[0][1];
        for (int i = 1; i < arr.length; i++){
            // 2
            if (endTime <= arr[i][0]){
                endTime = arr[i][1];
                count++;
            }
        }

        System.out.println(count);

    }
}
