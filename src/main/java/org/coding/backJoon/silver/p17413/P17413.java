package org.coding.backJoon.silver.p17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class P17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        solution(str);
    }

    private static void solution(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean flag = false;

        String[] split = str.split(" ");

        for (char c : str.toCharArray()) {
            if (c == '<') {
                sb.append(word.reverse());
                word.setLength(0);
                sb.append(c);
                flag = true;
            } else if (c == '>') {
                sb.append(c);
                flag = false;
            } else if (flag) {
                sb.append(c);
            } else if (c == ' ') {
                sb.append(word.reverse()).append(c);
                word.setLength(0);
            } else {
                word.append(c);
            }
        }
        sb.append(word.reverse());
        System.out.println(sb.toString());
    }
}
