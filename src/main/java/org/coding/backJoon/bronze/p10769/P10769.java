package org.coding.backJoon.bronze.p10769;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        solution(str);
    }

    private static void solution(String str) {
        int happy = 0;
        int sad = 0;

        for (int i = 0; i < str.length() - 2; i++){
            if (str.charAt(i) == ':' && str.charAt(i + 1) == '-' && str.charAt(i + 2) == ')'){
                happy++;
            }

            if (str.charAt(i) == ':' && str.charAt(i + 1) == '-' && str.charAt(i + 2) == '('){
                sad++;
            }
        }

        if (happy > sad){
            System.out.println("happy");
        } else if (happy < sad) {
            System.out.println("sad");
        } else if (happy == 0) {
            System.out.println("none");
        } else {
            System.out.println("unsure");
        }
    }
}
