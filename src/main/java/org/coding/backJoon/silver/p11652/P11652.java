package org.coding.backJoon.silver.p11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Long.parseLong(br.readLine());
        }

        solution(arr);
    }

    private static void solution(long[] arr) {
        long answer = 0;
        Map<Long, Integer> maps = new HashMap<>();

        for (long num : arr) {
            maps.put(num, maps.getOrDefault(num, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (Long num : maps.keySet()) {
            int count = maps.get(num);
            if (count > max || (count == max && num < answer)) {
                max = count;
                answer = num;
            }
        }


        System.out.println(answer);
    }
}
