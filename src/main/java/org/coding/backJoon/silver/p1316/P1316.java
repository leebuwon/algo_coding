package org.coding.backJoon.silver.p1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = new String[n];
        for (int i = 0; i < n; i++){
            input[i] = br.readLine();
        }

        System.out.println(solution(input));
    }

    private static int solution(String[] input) {
        int answer = input.length;

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < input.length; i++){
            String str = input[i];
            for (int j = 0; j < str.length(); j++){
                if (str.length() == 1){
                    break;
                }
                char c = str.charAt(j);
                strings.add(String.valueOf(c));

                if (j >= 1 && !strings.get(j - 1).equals(String.valueOf(c)) && strings.subList(0, j).contains(String.valueOf(c))){
                    answer--;
                    break;
                }
            }
            strings.clear();
        }

        return answer;
    }
}
