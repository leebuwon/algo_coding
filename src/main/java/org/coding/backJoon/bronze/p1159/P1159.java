package org.coding.backJoon.bronze.p1159;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = br.readLine();
        }

        solution(str);
    }

    private static void solution(String[] str) {
        Map<String, Integer> maps = new HashMap<>();

        for(int i = 0; i < str.length; i++){
            String name = str[i];
            String lastName = name.substring(0, 1);

            maps.put(lastName, maps.getOrDefault(lastName, 0) + 1);
        }

        List<String> list = new ArrayList<>();

        for (String s : maps.keySet()) {
            if(maps.get(s) >= 5){
                list.add(s);
            }
        }

        Collections.sort(list);

        if (list.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            for (String s : list) {
                System.out.print(s);
            }
        }

    }
}
