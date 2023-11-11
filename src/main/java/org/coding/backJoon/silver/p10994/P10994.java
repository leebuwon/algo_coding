package org.coding.backJoon.silver.p10994;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10994 {
    static char[][] chars;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int size = 4 * (n - 1) + 1;
        chars = new char[size][size];

        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j < chars[i].length; j++){
                chars[i][j] = ' ';
            }
        }

        solution(0, size);
    }

    private static void solution(int n, int size) {
        recursive(n, size);

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * [*, *, *, *, *],
     * [*,          *],
     * [*,    *,    *],
     * [*,          *],
     * [*, *, *, *, *]
     *
     * [*, *, *, *, *],
     * [*, *, *, *, *],
     * [*, *, *, *, *],
     * [*, *, *, *, *],
     * [*, *, *, *, *]
     *
     *
     */

    private static void recursive(int n, int size) {
        if (size <= n){
            return;
        }

        for (int i = n; i < size; i++){
            chars[n][i] = '*';
            chars[size - 1][i] = '*';
            chars[i][n] = '*';
            chars[i][size - 1] = '*';
        }


        recursive(n + 2, size - 2);
    }
}

/**
 * 0,0 -> 2,2 -> 4,4 -> 6,6
 * [*, *, *, *, *, *, *, *, *, *, *, *, *],
 * [*,                                  *],
 * [*,    *, *, *, *, *, *, *, *, *,    *],
 * [*,    *,                      *,    *],
 * [*,    *,    *, *, *, *, *,    *,    *],
 * [*,    *,    *,          *,    *,    *],
 * [*,    *,    *,    *,    *,    *,    *],
 * [*,    *,    *,          *,    *,    *],
 * [*,    *,    *, *, *, *, *,    *,    *],
 * [*,    *,                      *,    *],
 * [*,    *, *, *, *, *, *, *, *, *,    *],
 * [*,                                  *],
 * [*, *, *, *, *, *, *, *, *, *, *, *, *]
 *
 * [[*, *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *],
 * [ , *, *, *, *, *, *, *, *, *, *, *, *]]
 */
