package org.coding.backJoon.silver.p2529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P2529 {
    static String[] arr;
    static int k;
    static boolean[] visited;
    static List<String> answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            k = Integer.parseInt(br.readLine());
            visited = new boolean[10];

            StringTokenizer st = new StringTokenizer(br.readLine());
            arr = new String[k];
            for (int i = 0; i < k; i++) {
                arr[i] = st.nextToken();
            }

            dfs(new StringBuilder(), 0);
            System.out.println(answer.get(answer.size() - 1)); // max
            System.out.println(answer.get(0)); // min
        }
    }

    private static void dfs(StringBuilder num, int depth) {
        if (depth == k + 1) {
            answer.add(num.toString());
            System.out.println(answer);
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (depth == 0 || (!visited[i] && compare(num.charAt(num.length() - 1) - '0', i, arr[depth - 1]))) {
                visited[i] = true;
                dfs(num.append(i), depth + 1);
                visited[i] = false;
                num.setLength(num.length() - 1);
            }
        }
    }

    public static boolean compare(int a, int b, String c) {
        return c.equals("<") ? a < b : a > b;
    }
}