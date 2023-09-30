package org.coding.backJoon.bronze.p10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] chars = new char[5][15];

        for (int i = 0; i < chars.length; i++) {
            String line = br.readLine();
            char[] lineChars = line.toCharArray();
            for (int j = 0; j < lineChars.length; j++) {
                chars[i][j] = lineChars[j];
            }
        }

        System.out.println(solution(chars));

    }

    private static String solution(char[][] chars) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < chars[0].length; i++){
            for (int j = 0; j < chars.length; j++){
                if (chars[j][i] != 0){
                    answer.append(chars[j][i]);
                }
            }
        }

        return answer.toString();
    }
}
