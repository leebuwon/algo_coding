package org.coding.inflearn;

import java.util.Scanner;

/**
 * 강사님 풀이
 */
public class Inf1S02 {
        public String solution(String str) {
            String answer = "";
            for (char x : str.toCharArray()){
                if(Character.isLowerCase(x)) {
                    answer += Character.toUpperCase(x);
                } else {
                    answer += Character.toLowerCase(x);
                }
            }
            return answer;
        }

        public static void main(String[] args) {
        Inf1S02 T = new Inf1S02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}

/**
 * 내 풀이 방식
 */
//public class Inf1S02 {
//    public String solution(String str) {
//        String answer = "";
//        char[] chars = str.toCharArray();
//        String temp = "";
//
//
//        for (int i = 0; i < chars.length; i++){
//            if (chars[i] >= 97 && chars[i] <= 122){
//                temp = chars[i] + "";
//                temp = temp.toUpperCase();
//                answer += temp;
//            } else {
//                temp = chars[i] + "";
//                temp = temp.toLowerCase();
//                answer += temp;
//            }
//        }
//
//        return answer;
//    }
//
//
//
//    public static void main(String[] args) throws IOException {
//        Inf1S02 T = new Inf1S02();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//
//        System.out.println(T.solution(str));
//    }
//}