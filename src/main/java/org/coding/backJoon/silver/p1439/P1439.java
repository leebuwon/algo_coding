package org.coding.backJoon.silver.p1439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        solution(str);
    }

    private static void solution(String str) {
        int zeroCount = 0;
        int oneCount = 0;

        if (str.charAt(0) == '0') {
            zeroCount++;
        } else {
            oneCount++;
        }

        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(i - 1)){
                if (str.charAt(i) == '0'){
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
        }

        int min = Math.min(zeroCount, oneCount);
        System.out.println(min);

    }
}
