package org.coding.backJoon.bronze.p16171;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        solution(str1, str2);

    }


    private static void solution(String str1, String str2) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            }
        }

        int count = 0;
        for (int i = 0; i <= sb.length() - str2.length(); i++){
            int num = 0;
            for (int j = 0; j < str2.length(); j++){
                if (sb.charAt(i + j) == str2.charAt(j)) {
                    num++;
                }
            }
            count = Math.max(count, num);
        }

        if (count == str2.length()){
            System.out.println(answer + 1);
        }

        System.out.println(answer);
    }
}
