package org.coding.backJoon.bronze.p1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        Map<String, Integer> maps = new HashMap<>();
        String upperCase = str.toUpperCase();
        String[] split = upperCase.split("");

        for (int i = 0; i < split.length; i++){
            if (!maps.containsKey(split[i])){
                maps.put(split[i], 0);
            } else {
                int currentValue = maps.get(split[i]);
                maps.put(split[i], currentValue + 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedEntries = maps.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())).toList();

        // 문자가 없을 경우
        if (sortedEntries.isEmpty()){
            return "?";
        }

        if (sortedEntries.get(0).getValue().equals(sortedEntries.get(1).getValue())) {
            answer = "?";
        } else {
            answer = sortedEntries.get(0).getKey();
        }

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
//    private static char solution(String str) {
//        int[] arr = new int[26];
//
//        for (int i = 0; i < str.length(); i++){
//            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
//                arr[str.charAt(i) - 'A']++;
//            }
//
//            else {
//                arr[str.charAt(i) - 'a']++;
//            }
//        }
//
//        int max = Integer.MIN_VALUE;
//        char ch = '?';
//
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//                ch = (char) (i + 65);
//            }
//            else if (arr[i] == max){
//                ch = '?';
//            }
//        }
//
//        return ch;
//    }
}
