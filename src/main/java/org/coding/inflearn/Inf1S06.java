package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf1S06 {
    /**
     * 내가 푼 방식
     */
    public static String duplicateAlphabets(String str){
        String answer = "";
        char[] chars = str.toCharArray();
        for (char duplicateChar : chars){
            if (!answer.contains(String.valueOf(duplicateChar))){
                answer += duplicateChar;
            }
        }

        return answer;
    }

    /**
     * 강사님 풀이 방식
     */
//    public static String duplicateAlphabets(String str){
//        String answer = "";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
//            if (str.indexOf(str.charAt(i)) == i){
//                answer += str.charAt(i);
//            }
//        }
//
//
//        return answer;
//    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String duplicateAlphabets = duplicateAlphabets(str);
        System.out.println(duplicateAlphabets);
    }
}
