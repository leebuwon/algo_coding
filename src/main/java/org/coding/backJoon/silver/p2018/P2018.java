package org.coding.backJoon.silver.p2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 1;

        // 투 포인터
        int startIdx = 1;
        int endIdx = 1;
        int sum = 1;

        while (endIdx != n){
            if (sum == n){
                answer++;
                endIdx++;
                sum = sum + endIdx;
            } else if (sum > n) {
                sum = sum - startIdx;
                startIdx++;
            } else {
                endIdx++;
                sum = sum + endIdx;
            }
        }
        return answer;
    }
}
