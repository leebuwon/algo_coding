package org.coding.backJoon.silver.p5635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> str = new ArrayList<>();
        for (int i = 0; i < n; i++){
            str.add(br.readLine());
        }

        solution(str);
    }

    private static void solution(List<String> str) {
        List<String> sort = str.stream()
                .sorted((s1, s2) -> {
                    String[] str1 = s1.split(" ");
                    String[] str2 = s2.split(" ");

                    int year1 = Integer.parseInt(str1[3]);
                    int month1 = Integer.parseInt(str1[2]);
                    int day1 = Integer.parseInt(str1[1]);

                    int year2 = Integer.parseInt(str2[3]);
                    int month2 = Integer.parseInt(str2[2]);
                    int day2 = Integer.parseInt(str2[1]);

                    if (year1 != year2) {
                        return year1 - year2;
                    } else if (month1 != month2) {
                        return month1 - month2;
                    } else {
                        return day1 - day2;
                    }
                })
                .toList();

        System.out.println(sort.get(sort.size() - 1).split(" ")[0]);
        System.out.println(sort.get(0).split(" ")[0]);
    }
}
