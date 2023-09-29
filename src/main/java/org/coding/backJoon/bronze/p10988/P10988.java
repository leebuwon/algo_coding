package org.coding.backJoon.bronze.p10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = sb.append(str).reverse();

        String reverseStr = String.valueOf(reverse);

        if (reverseStr.equals(str)){
            return 1;
        }

        return 0;
    }
}
