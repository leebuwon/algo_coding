package org.coding.backJoon.silver.p1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for (int i = 0; i < n; i++){
            str[i] = br.readLine();
        }

        solution(n, str);
    }

    private static void solution(int n, String[] str) {
        Set<String> set = new HashSet<>();
        List<String> strList = new ArrayList<>();

        for (int i = 0; i < str.length; i++){
            set.add(str[i]);
        }

        for (String s : set){
            strList.add(s);
        }

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
        }
    }
}
