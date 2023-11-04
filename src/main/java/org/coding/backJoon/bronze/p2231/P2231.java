package org.coding.backJoon.bronze.p2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution(n);
    }

    private static void solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++){
            String str = String.valueOf(i);
            int nowNum = Integer.parseInt(str);
            int temp = nowNum;
            for (int j = 0; j < str.length(); j++){

                temp += Integer.parseInt(String.valueOf(str.charAt(j)));
            }

            if (temp == n){
                answer = nowNum;
                break;
            }
        }

        System.out.println(answer);
    }
}
