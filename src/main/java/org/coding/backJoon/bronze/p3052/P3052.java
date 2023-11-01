package org.coding.backJoon.bronze.p3052;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class P3052 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[10];
        for (int i = 0; i < n.length; i++){
            n[i] = Integer.parseInt(br.readLine());
        }

        solution(n);
    }

    private static void solution(int[] n) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n.length; i++){
            set.add(n[i] % 42);
        }

        System.out.println(set.size());
    }
}
