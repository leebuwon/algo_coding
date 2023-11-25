package org.coding.backJoon.silver.p11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        solution(n, k, arr);
    }

    // 1000 1000 1000 1000 500 100 100 50 10 10 10 10
    private static void solution(int n, int k, int[] arr) {
        int count = 0;


        for (int i = n - 1; i >= 0; i--){
            if (k / arr[i] != 0){
                count += k / arr[i];
                k %= arr[i];
            }

        }

        System.out.println(count);

        // 시간 초과
//        while (k != 0) {
//            for (int i = 0; i < n; i++){
//
//                if (k < arr[i]){
//                    k -= arr[i - 1];
//                    count++;
//                    break;
//                }
//
//                // k랑 값이 같을 경우
//                if (k == arr[i]){
//                    k -= arr[i];
//                    count++;
//                    break;
//                }
//            }
//        }

    }
}
