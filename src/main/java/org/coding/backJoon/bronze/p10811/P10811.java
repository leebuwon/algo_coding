package org.coding.backJoon.bronze.p10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            /**
             *
             */
//            arr = reverseArray(arr, start - 1, end - 1);

            // return을 안받아도 되는 이유는 arr이 메서드에 전달될 때 실제로 배열의 참조가 복사되는 것이라 그렇다.
            // 즉, Call by Reference 형식으로 진행되기 떄문에 main에 있는 arr이 바뀌는 것! (참조에 의해서 공유됨)
            reverseArray(arr, start - 1, end - 1);

        }

        System.out.print(arr[0]);
        for (int i  = 1; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }

    private static void reverseArray(int[] arr, int start, int end) {
        // pivot 활용
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
