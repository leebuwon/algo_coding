package org.coding.inflearn;

import org.coding.lv0.p120807.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inf1S04 {
    public static String[] solution(int n, String[] str) {
        String[] newStr = new String[n];

        for (int i = 0; i < n; i++){
            // 단어 뒤집기
            StringBuilder sb = new StringBuilder(str[i]).reverse();
            newStr[i] = sb.toString();
        }

        return newStr;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // readLine 으로 받은 입력 데이터 String 이다.
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];

        for (int i = 0; i < n; i++){
            str[i] = br.readLine();
        }

        String[] reversedStr = solution(n, str);

        for (int i = 0; i < reversedStr.length; i++) {
            System.out.println(reversedStr[i]);
        }
    }
}

/**
 * 강사님 풀이
 */
//class Inf1S04 {
//    public ArrayList<String> solution(int n, String[] str) {
//        ArrayList<String> answer = new ArrayList<>();
//        for (String x : str){
//            String tmp = String.valueOf(new StringBuilder(x).reverse());
//            answer.add(tmp);
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Inf1S04 T = new Inf1S04();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        String[] str = new String[n];
//
//        for (int i = 0; i < n; i++){
//            str[i] = kb.next();
//        }
//
//        for (String x : T.solution(n, str)){
//            System.out.println(x);
//        }
//    }
//}