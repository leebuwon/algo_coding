package org.coding.backJoon.gold.p13144;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P13144 {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr);
    }

    /**
     * 메모리 초과
     * 추후에 다시 풀기..
     */
    private static void solution(int[] arr) {
        int count = 0;

        for (int start = 0; start < n; start++) {
            Set<Integer> set = new HashSet<>();
            int end = start;

            while (end < n && !set.contains(arr[end])) {
                set.add(arr[end]);
                end++;
            }

            count += end - start;
        }

        System.out.println(count);
    }
}