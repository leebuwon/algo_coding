package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf1S11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s = solution(str);
        System.out.println(s);
    }
    private static String solution(String str) {
        String answer = "";
        str = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)){
                cnt++;
            }else {
                answer += str.charAt(i);
                if (cnt > 1){
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        return answer;

    }

    /**
     * 내가 푼 코드
     */
//    private static String solution(String str) {
//        List<String> arrList = new ArrayList<>();
//        StringBuilder result = new StringBuilder();
//        int sum = 1;
//
//        for (int i = 0; i < str.length(); i++) {
//            String currentChar = String.valueOf(str.charAt(i));
//
//
//            if (!arrList.contains(currentChar)) {
//                arrList.add(currentChar);
//                if (sum > 1) {
//                    result.append(sum);
//                }
//                result.append(currentChar);
//                sum = 1;
//            } else {
//                sum++;
//            }
//        }
//
//        if (sum > 1) {
//            result.append(sum);
//        }
//        return result.toString();
//    }
}