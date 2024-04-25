package org.coding.backJoon.bronze.p1292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        solution(start, end);
    }

    private static void solution(int start, int end) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < end; i++) {
                for (int j = 0; j <= i; j++) {
                    arr.add(i + 1);
            }
        }

        int sum = 0;
        for (int i = start - 1; i <= end - 1; i++){
            sum += arr.get(i);
        }


        System.out.println(sum);
    }
}
