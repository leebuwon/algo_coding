package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Inf1S12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String s = solution(n, str);
        System.out.println(s);
    }

    /**
     * 강사님 풀이
     */
//    private static String solution(int n, String str) {
//        String answer = "";
//        for (int i = 0; i < n ; i++){
//            String substring = str.substring(0, 7).replace("#", "1").replace("*", "0");
//            int decimal = Integer.parseInt(substring, 2);
//            answer += (char) decimal;
//            str = str.substring(7);
//        }
//
//        return answer;
//    }

    private static String solution(int n, String str) {
        String answer = "";
        str = str.replace("#", "1").replace("*", "0");
        List<Integer> arr = new ArrayList<>();


        for (int i = 0; i < str.length(); i += 7){
            String substring = str.substring(i, Math.min(i + 7, str.length()));
            if (substring.length() == 7) {
                int decimal = Integer.parseInt(substring, 2);
                arr.add(decimal);
            }
        }

        for (int i = 0; i < n; i++){
            int num = arr.get(i);
            char ascii = (char) num;
            answer += ascii;
        }

        return answer;
    }
}
