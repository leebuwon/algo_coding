package org.coding.backJoon.silver.p11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }

    private static int solution(String str) {

        Set<String> strings = new HashSet<>();
        for (int i = 0; i < str.length(); i++){
            for (int j = i + 1; j <= str.length(); j++){
                strings.add(str.substring(i, j));
            }
        }

        return strings.size();
    }
}