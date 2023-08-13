package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf1S07 {
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
//        String answer = "YES";
//        str = str.toLowerCase();
//        int len = str.length();
//        for (int i = 0; i < len/2; i++){
//            if (str.charAt(i) != str.charAt(len - i - 1)){
//                answer = "NO";
//            }
//        }
//
//        return answer;
//    }

    private static String solution(String str) {
        String lowerCase = str.toLowerCase();
        StringBuilder sb = new StringBuilder(lowerCase);
        String reverse = sb.reverse().toString();

        if (lowerCase.equals(reverse)){
            return "YES";
        }

        return "NO";
    }
}
