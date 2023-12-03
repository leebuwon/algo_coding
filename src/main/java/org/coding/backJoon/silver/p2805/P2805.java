package org.coding.backJoon.silver.p2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr, m);
    }

    private static void solution(int[] arr, int m) {
        Arrays.sort(arr);

        binarySearch(arr, m);

    }

    /**
     * 4 7
     * 20 15 10 17
     */
    private static void binarySearch(int[] arr, int m) {
        int low = 0;
        int high = arr[arr.length - 1];
        int result = 0;

        while (low <= high) {
            int middle = (low + high) / 2;
            long sum = calculateSum(arr, middle);

            if (sum >= m) {
                result = middle;
                if (result == m){
                    break;
                }
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        System.out.println(result);
    }

    private static long calculateSum(int[] arr, int middle) {
        long sum = 0;

        for (int tree : arr) {
            if (tree > middle) {
                sum += tree - middle;
            }
        }

        return sum;
    }
}