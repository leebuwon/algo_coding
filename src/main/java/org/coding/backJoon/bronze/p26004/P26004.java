package org.coding.backJoon.bronze.p26004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P26004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        solution(n, str);
    }

    private static void solution(int n, String str) {
        if (n < 5){
            System.out.println(0);
            return;
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("H", 0);
        map.put("I", 0);
        map.put("A", 0);
        map.put("C", 0);
        map.put("R", 0);

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (map.containsKey(String.valueOf(c))){
                map.put(String.valueOf(c), map.getOrDefault(String.valueOf(c), 0) + 1);
            }
        }

        int min = Integer.MAX_VALUE;
        for (Integer value : map.values()) {
            if (value < min){
                min = value;
            }
        }

        System.out.println(min);
    }
}
