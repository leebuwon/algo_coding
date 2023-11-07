package org.coding.backJoon.silver.p14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] str = new String[n];
        for (int i = 0; i < n; i++){
            str[i] = br.readLine();
        }

        String[] str2 = new String[m];
        for (int i = 0; i < m; i++){
            str2[i] = br.readLine();
        }

        solution(str, str2);
    }

    private static void solution(String[] str, String[] str2) {
        int answer = 0;

        List<String> strList = new ArrayList<>(Arrays.asList(str));

        for (int i = 0; i < str2.length; i++){
            if (strList.contains(str2[i])){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
