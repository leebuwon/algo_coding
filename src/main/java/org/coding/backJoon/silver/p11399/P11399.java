package org.coding.backJoon.silver.p11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, arr);
    }

    /**
     * 책 풀이 : 삽입 정렬
     */
    private static void solution(int n, int[] arr) {
        int answer = 0;
        int[] prefixSum = new int[n];

        for (int i = 1; i < n; i++){
            int insert_point = i;
            int insert_value = arr[i];
            for (int j = i - 1; j >= 0; j--){
                if (arr[j] < arr[i]){
                    insert_point = j + 1;
                    break;
                }
                if (j == 0){
                    insert_point = 0;
                }
            }
            for (int j = i; j > insert_point; j--){
                arr[j] = arr[j - 1];
            }
            arr[insert_point] = insert_value;
        }

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int i = 0;  i < n; i++){
            answer += prefixSum[i];
        }

        System.out.println(answer);
    }


    /**
     * 내가 푼 풀이 : 선택정렬
     */
//    private static void solution(int n, int[] arr) {
//        int answer = 0;
//        int[] prefixSum = new int[n];
//
//        for (int i = 0; i < n; i++){
//            int max = i;
//            for (int j = i + 1; j < n; j++){
//                if (arr[max] > arr[j]){
//                    max = j;
//                }
//            }
//
//            int temp = arr[max];
//            arr[max] = arr[i];
//            arr[i] = temp;
//        }
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++){
//            sum += arr[i];
//            prefixSum[i] = sum;
//        }
//
//        for (int i = 0; i < arr.length; i++){
//            answer += prefixSum[i];
//        }
//
//        System.out.println(answer);
//    }
}
