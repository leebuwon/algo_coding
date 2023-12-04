package org.coding.backJoon.gold.p2110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 풀이 참조
 */
public class P2110 {
    static int c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }


        solution(c, arr);
    }

    private static void solution(int c, int[] arr) {
        Arrays.sort(arr);

        binarySearch(c, arr);
    }

    private static void binarySearch(int c, int[] arr) {
        int left = 1;
        int right = arr[arr.length - 1];

        while (left <= right){
            int middle = left + (right - left) / 2;

            int position = 0;
            int count = 1;
            count = getCount(arr, middle, position, count);

            if (count < c){
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        System.out.println(right);
    }

    private static int getCount(int[] arr, int middle, int position, int count) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[position] >= middle){
                position = i;
                count++;
            }
        }
        return count;
    }
}
