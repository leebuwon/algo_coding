package org.coding.backJoon.bronze.p10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }

    private static int solution(String str) {
        int answer = 0;

        String trim = str.trim();
        if (trim.isEmpty()){
            return answer;
        }

        String[] split = trim.split(" ");

        answer = split.length;


        return answer;
    }
}
