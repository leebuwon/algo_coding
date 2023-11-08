package org.coding.backJoon.silver.p1764;

import java.io.*;
import java.util.*;

public class P1764 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] str1 = new String[n];
        for (int i = 0; i < n; i++){
            str1[i] = br.readLine();
        }

        String[] str2 = new String[m];
        for (int i = 0; i < m; i++){
            str2[i] = br.readLine();
        }

        solution(n, str1, m, str2);
    }

    private static void solution(int n, String[] str1, int m, String[] str2) throws IOException {
        Arrays.sort(str1);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new HashMap<>();
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < str2.length; i++){
            map.put(str2[i], 0);
        }

        // map의 containsKey가 ArrayList의 contains보다 횔씬 빠르다.
        for (String s : str1) {
            if (map.containsKey(s)) {
                answer.add(s);
            }
        }

        System.out.println(answer.size());

        for (int i = 0; i < answer.size(); i++){
            bw.write(answer.get(i) + "\n");
        }

        bw.close();
    }
}
