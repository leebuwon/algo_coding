package org.coding.backJoon.silver.p1057;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int lim = Integer.parseInt(st.nextToken());

        solution(n, kim, lim);
    }

    private static void solution(int n, int kim, int lim) {
        int count = 0;

        while (true){
            kim = (kim + 1) / 2;
            lim = (lim + 1) / 2;
            count++;

            if (kim == lim){
                break;
            }

        }

        System.out.println(count);
    }
}
