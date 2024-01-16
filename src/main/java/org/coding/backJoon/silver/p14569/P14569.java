package org.coding.backJoon.silver.p14569;

import java.util.Arrays;
import java.util.Scanner;

public class P14569 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] v = new long[n];
        for (int i = 0; i < n; i++) {
            long m = sc.nextLong();
            for (int j = 0; j < m; j++) {
                long current = sc.nextLong();
                v[i] |= (1L << current);
            }
        }

        // [11110, 1111111000, 11000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000]

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            long m = sc.nextLong();
            long now = 0;

            for (int j = 0; j < m; j++) {
                long input = sc.nextLong();
                now |= (1L << input);
            }

            int ans = 0;
            for (int j = 0; j < n; j++) {
                if ((v[j] & now) == v[j]) {
                    ans++;
                }
            }
            System.out.println(ans);
        }

        sc.close();
    }
}