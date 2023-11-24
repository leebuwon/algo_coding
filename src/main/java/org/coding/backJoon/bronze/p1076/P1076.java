package org.coding.backJoon.bronze.p1076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[3];

        for (int i = 0; i < str.length; i++){
            str[i] = br.readLine();
        }

        solution(str);
    }

    private static void solution(String[] str) {
        long answer = 0;
        Map<String, String> map = new HashMap<>();
        map.put("black","0");
        map.put("brown", "1");
        map.put("red", "2");
        map.put("orange", "3");
        map.put("yellow", "4");
        map.put("green", "5");
        map.put("blue", "6");
        map.put("violet", "7");
        map.put("grey", "8");
        map.put("white", "9");


        for (int i = 0; i < str.length; i++){
            if (i == 0){
                answer += Long.parseLong(map.get(str[i])) * 10;
            } else if (i == 1) {
                answer += Long.parseLong(map.get(str[i]));
            } else {
                answer *= Math.pow(10, Long.parseLong(map.get(str[i])));
            }
        }

        System.out.println(answer);
    }
}
