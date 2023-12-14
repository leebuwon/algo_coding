package org.coding.backJoon.silver.p18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P18111 {
    static int[][] map;
    static int n;
    static int m;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int countMin = Integer.MAX_VALUE;
    static int high = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, map[i][j]);
                min = Math.min(min, map[i][j]);
            }
        }

        solution(b);
    }

    private static void solution(int b) {
        int start = min;
        int end = max;

        while (start <= end){
            int count = 0;
            int blockCount = b;
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    if (map[i][j] == start){
                        continue;
                    }

                    if (map[i][j] > start){
                        blockCount += map[i][j] - start;
                        count += (map[i][j] - start) * 2;
                    } else {
                        blockCount -= start - map[i][j];
                        count += start - map[i][j];
                    }
                }
            }

            if (blockCount < 0){
                start++;
                continue;
            }

            if (countMin >= count && high < start){
                countMin = count;
                high = start;
            }

            start++;
        }

        System.out.print(countMin + " ");
        System.out.println(high);
    }
}
