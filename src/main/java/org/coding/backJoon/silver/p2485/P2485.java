package org.coding.backJoon.silver.p2485;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 풀이 참조
 */
public class P2485 {
    static int treeDistance; // 간격
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        solution(n, arr);
    }

    /**
     * 2 4 6 12 18 -> 8, 10, 14, 16 (총 4그루를 심어야 한다.)
     * 3 6 15 21 30 -> 9, 12, 18, 24, 27 (총 5그루 심어야 한다.)
     */
    private static void solution(int n, int[] arr) {
        int distance = 0;

        for (int i = 0; i < n - 1; i++){
            treeDistance = arr[i + 1] - arr[i];
            distance = gcd(treeDistance, distance);
        }

        // (13 - 1) / 2 + 1 - 4
        // 12 / 2 + 1 - 4
        // 6 + 1 - 4
        // = 3

        // 18 - 2 / 2 + 1 - 5
        // 9 - 5 = 4
        System.out.println((arr[n - 1] - arr[0]) / distance + 1 - (n));
    }

    private static int gcd(int treeDistance, int distance) {
        while (distance != 0){
            int temp = distance;
            distance = treeDistance % distance;
            treeDistance = temp;
        }

        return treeDistance;
    }
}
