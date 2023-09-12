package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf2S08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int x : solution(n, arr)){
            System.out.print(x + " ");
        }

    }

    /**
     * 강사님 풀이
     */
//    private static int[] solution(int n, int[] arr) {
//        int[] answer = new int[n];
//        for (int i = 0; i < n; i++){
//            int cnt = 1;
//            for (int j = 0; j < n; j++){
//                if (arr[j] > arr[i]){
//                    cnt++;
//                }
//                answer[i] = cnt;
//            }
//        }
//
//
//        return answer;
//    }

    private static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++){
            int flag = arr[i];
            answer[i]++;
            for (int j = 0; j < n; j++){
                if (flag < arr[j]){
                    answer[i]++;
                }
            }
        }


        return answer;
    }
}
