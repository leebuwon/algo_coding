package org.coding.backJoon.silver.p20291;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for (int i = 0; i < str.length; i++){
            str[i] = br.readLine();
        }

        solution(str);
    }

    private static void solution(String[] str) {
        Map<String, Integer> maps = new HashMap<>();

        for (String s : str) {
            String[] split = s.split("\\.");
            maps.put(split[1], maps.getOrDefault(split[1], 0) + 1);
        }

        Map<String, Integer> treeMap = new TreeMap<>(maps);

        for (String key : treeMap.keySet()) {
            System.out.println(key + " " + treeMap.get(key));
        }
    }
}
