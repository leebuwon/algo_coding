package org.coding.backJoon.silver.p1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1654 {
    static long max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        for (int i = 0; i < k; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        solution(n, arr);
    }

    private static void solution(int n, int[] arr) {
        Arrays.sort(arr);

        binarySearch(arr, n);
    }


    // n개보다 많이 만드는 것도 n개를 만드는 것에 포함되는 것이다.
    private static void binarySearch(int[] arr, int n) {
        // 탐색 범위의 최솟값은 1입니다. 0으로 하면 ZeroDivisionError가 납니다.
        // 탐색 범위를 의미하는 변수들은 long으로 선언해야 합니다. 그렇지 않으면 1 + (2^31-1) 에서 오버플로가 발생하기 때문입니다.
        long left = 1; // 이걸 왜 1로해야되지..
        long right = arr[arr.length - 1];
        while (left <= right){
            long lineLength = (left + right) / 2;
            // 자른 선의 갯수
            long sum = calculate(arr, lineLength);

            // 랜선의 갯수가 n보다 클 경우만 넣어준다.
            if (sum >= n){
                if (max < lineLength) {
                    max = lineLength;
                }
            }

            if (sum >= n){
                left = lineLength + 1;
            } else {
                right = lineLength - 1;
            }
        }

        System.out.println(max);
    }

    /**
     * 자를 수 있는 수를 리턴
     */
    private static long calculate(int[] arr, long middle) {
        int sum = 0;
        for (int len : arr) {
            if (len >= middle){
                sum += len / middle;
            }
        }

        return sum;
    }
}
