package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf1S08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s = solution(str);
        System.out.println(s);
    }

    /**
     * 강사님 풀이
     */
//    private static String solution(String str) {
//        String answer = "NO";
//        str = str.toUpperCase().replaceAll("[^A-Z]", "");
//        String tmp = new StringBuilder(str).reverse().toString();
//
//        if (str.equals(tmp)){
//            answer = "YES";
//            return answer
//        }
//        return answer;
//    }

    private static String solution(String str) {
        String lowerCase = str.toLowerCase().replaceAll("[@$^,:;]", "");
        StringBuilder sb = new StringBuilder(lowerCase);
        String reverseString = sb.reverse().toString();

        if (lowerCase.equals(reverseString)){
            return "YES";
        }

        return "NO";
    }
}
