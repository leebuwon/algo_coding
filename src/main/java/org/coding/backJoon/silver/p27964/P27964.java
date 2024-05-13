package org.coding.backJoon.silver.p27964;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P27964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < str.length; i++){
            str[i] = st.nextToken();
        }

        solution(str);
    }

    private static void solution(String[] str) {
        Map<String, Integer> maps = new HashMap<>();

        for (int i = 0; i < str.length; i++){
            maps.put(str[i], maps.getOrDefault(str[i], 0) + 1);
        }

        int count = 0;
        for (String s : maps.keySet()) {
            char[] charArray = s.toCharArray();
            if (charArray.length < 6){
                continue;
            }

            if (charArray[charArray.length - 6] == 'C' && charArray[charArray.length - 5] == 'h' && charArray[charArray.length - 4] == 'e'
            && charArray[charArray.length - 3] == 'e' && charArray[charArray.length - 2] == 's' && charArray[charArray.length - 1] == 'e') {
                count++;
            }
        }

        if (count >= 4){
            System.out.println("yummy");
        } else {
            System.out.println("sad");
        }
    }
}
