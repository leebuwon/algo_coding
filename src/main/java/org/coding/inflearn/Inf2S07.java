package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf2S07 {
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
     * 강사님 코드
     */
//    private static int solution(int n, int[] arr) {
//        int answer = 0;
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            if (arr[i] == 1){
//                cnt++;
//                answer += cnt;
//            } else {
//                cnt = 0;
//            }
//        }
//
//        return answer;
//    }

    private static int solution(int n, int[] arr) {
        int answer = 0;
        int count = 0;
        if (arr[0] == 1){
            count++;
            answer += count;
        }

        for (int i = 1; i < n; i++){
            if (arr[i] == 0){
                count = 0;
            } else {
                count++;
                answer += count;
            }
        }

        return answer;
    }
}
