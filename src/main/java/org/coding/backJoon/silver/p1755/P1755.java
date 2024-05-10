package org.coding.backJoon.silver.p1755;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        solution(m, n);
    }

    private static void solution(int m, int n) {
        String[] str = new String[10];
        str[0] = "zero";
        str[1] = "one";
        str[2] = "two";
        str[3] = "three";
        str[4] = "four";
        str[5] = "five";
        str[6] = "six";
        str[7] = "seven";
        str[8] = "eight";
        str[9] = "nine";

        List<String> alphabet = new ArrayList<>();
        for (int i = m; i <= n; i++){
            String num = String.valueOf(i);

            StringBuilder sb = new StringBuilder();
            for (char c : num.toCharArray()) {
                if (sb.length() > 0) sb.append(" ");
                sb.append(str[c - '0']);
            }

            alphabet.add(sb.toString());
        }

        Collections.sort(alphabet);

        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);

        List<Integer> arr = new ArrayList<>();
        for (String s : alphabet) {
            String[] split = s.split(" ");
            int number = 0;
            for (String num : split) {
                number = number * 10 + numberMap.get(num);
            }
            arr.add(number);
        }

        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
