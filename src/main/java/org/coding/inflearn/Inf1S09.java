package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf1S09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int s = solution(str);
        System.out.println(s);
    }

    /**
     * 강사님 풀이
     */
    private static int solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()){
            if (Character.isDigit(x)){
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

//    private static int solution(String str) {
//        int n = Integer.parseInt(str.replaceAll("[^0-9]", ""));
//        return n;
//    }
}
