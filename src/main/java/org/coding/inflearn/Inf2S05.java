package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inf2S05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int solution = solution(n);
        System.out.println(solution);
    }

    /**
     * 강사님 풀이
     */
//    private static int solution(int n) {
//        int answer = 0;
//        int[] ch = new int[n + 1];
//        for(int i = 2; i <= n; i++){
//            if(ch[i] == 0){
//                answer++;
//                for (int j = i; j <= n; j = j + i){
//                    ch[j] = 1;
//                }
//            }
//        }
//        return answer;
//    }

    private static int solution(int n) {
        int sum = 0;
        if (n <= 1){
            return 1;
        }

        for (int i = 2; i < n; i++){
            if (isPrime(i)){
                sum++;
            }
        }

        return sum;
    }

    private static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
