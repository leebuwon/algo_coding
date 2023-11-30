package org.coding.backJoon.silver.p16953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16953 {
    static long a;
    static long b;
    static long ans;
    static boolean flag;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());

        solution(a, b);
        dfs(a, 1);
        if (flag){
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }

    /**
     * dfs 풀이 참조
     */
    private static void dfs(long a, int count) {
        if (a > b){
            return;
        }

        if (a == b){
            ans = count;
            flag = true;
            return;
        }

        dfs(a * 2, count + 1);
        dfs(a * 10 + 1, count + 1);


    }

    /**
     * 내 풀이
     */
    private static void solution(long a, long b) {
        int count = 1;

        while (a < b){
            long lastDigit = b % 10;

            if (lastDigit == 1){
                count++;
                b = b / 10;
            } else {
                if (b % 2 == 0){
                    count++;
                    b = b / 2;
                } else {
                    break;
                }
            }
        }

        if (a == b){
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
