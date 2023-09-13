package org.coding.lv1.p131128;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P131128 {
    public static void main(String[] args) {
//        new Solution().solution("100", "2345");
//        new Solution().solution("100", "203045");
        new Solution().solution("5525", "1255");
//        new Solution().solution("12321", "42531");
    }
}

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        String[] xSplit = X.split("");
        String[] ySplit = Y.split("");

        int[] yCounts = new int[10];

        for (String digit : ySplit) {
            int value = Integer.parseInt(digit);
            yCounts[value]++;
        }

        System.out.println(Arrays.toString(yCounts));

        List<String> strList = new ArrayList<>();
        for (String word : xSplit) {
            int value = Integer.parseInt(word);
            if (yCounts[value] > 0) {
                strList.add(word);
                yCounts[value]--;
            }
        }

        if (strList.isEmpty()) {
            return "-1";
        }

        strList.sort(Collections.reverseOrder());

        if (strList.get(0).equals("0") && strList.get(strList.size() - 1).equals("0")) {
            return "0";
        }

        for (String s : strList) {
            answer.append(s);
        }


        return answer.toString();
    }
}

/**
 * 시간 초과
 */
//class Solution {
//    public String solution(String X, String Y) {
//        StringBuilder answer = new StringBuilder();
//        String[] xSplit = X.split("");
//        String[] ySplit = Y.split("");
//
//        List<String> strList = new ArrayList<>();
//        for (int i = 0; i < xSplit.length; i++){
//            String word = xSplit[i];
//            for (int j = 0; j < ySplit.length; j++){
//                if (word.contains(ySplit[j])){
//                    strList.add(word);
//                    ySplit[j] = " ";
//                    break;
//                }
//            }
//        }
//
//        if (strList.isEmpty()){
//            return "-1";
//        }
//
//        strList.sort(Collections.reverseOrder());
//
//        if (strList.get(0).equals("0") && strList.get(strList.size() - 1).equals("0")){
//            answer = new StringBuilder("0");
//        }
//
//        for (String s : strList) {
//            answer.append(s);
//        }
//
//        return answer.toString();
//    }
//}