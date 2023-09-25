package org.coding.backJoon.bronze.p2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        String[] str = new String[2];
        for (int i = 0; i < 2; i++) {
            str[i] = input[i];
        }

        System.out.println(solution(str));
    }

    private static String solution(String[] str) {
        StringBuilder answer = new StringBuilder();

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < str.length; i++){
            String temp = str[i];
            for (int j = temp.length() - 1; j >= 0; j--){
                answer.append(temp.charAt(j));
            }

            integerList.add(Integer.parseInt(String.valueOf(answer)));
            answer.setLength(0);
        }

        if (integerList.get(0) < integerList.get(1)){
            answer.append(integerList.get(1));
        }else {
            answer.append(integerList.get(0));
        }

        return answer.toString();
    }
}