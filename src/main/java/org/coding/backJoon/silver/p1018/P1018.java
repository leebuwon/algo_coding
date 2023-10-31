package org.coding.backJoon.silver.p1018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 풀이 참조
 */
public class P1018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

//        char[][] chars = new char[n][m];
        String[][] str = new String[n][m];
        for (int i = 0; i < n; i++) {
//            chars[i] = br.readLine().toCharArray();
            str[i] = br.readLine().split("");
        }

        solution(n, m, str);
    }

    private static void solution(int n, int m, String[][] str) {
        int answer = 0;

        int min = 64;
        for (int i = 0; i < n - 7; i++){
            for (int j = 0; j < m - 7; j++){
                min = Math.min(min, cube(i, j, str));
            }
        }

        answer = min;

        System.out.println(answer);
    }

    private static int cube(int i, int j, String[][] str) {
        int count = 0;

        String color = "W";

        for (int row = i; row < i + 8; row++) {
            for (int col = j; col < j + 8; col++) {
                if(!str[row][col].equals(color)) {
                    count++;
                }

                if(color.equals("W")) {
                    color = "B";
                }else {
                    color = "W";
                }
            }

            if(color.equals("W")) {
                color = "B";
            }else {
                color = "W";
            }
        }

        count = Math.min(count, 64 - count);

        return count;
    }
}
