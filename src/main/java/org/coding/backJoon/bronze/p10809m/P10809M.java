package org.coding.backJoon.bronze.p10809m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P10809M {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        solution(str);
    }

    private static void solution(String str) {
        Map<Character, Integer> answerMap = new HashMap<>();

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (!answerMap.containsKey(chars[i])){
                answerMap.put(chars[i], i);
            }
        }

        int[] answer = new int[26];

        for (int i = 0; i < answer.length; i++) {
            char ch = (char) ('a' + i);
            answer[i] = answerMap.getOrDefault(ch, -1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length - 1; i++){
            sb.append(answer[i]).append(" ");
        }

        sb.append(answer[answer.length - 1]);

        System.out.println(sb.toString());
    }
}
