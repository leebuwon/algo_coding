package org.coding.backJoon.bronze.p9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());

            if (a == -1){
                break;
            }

            int sum = 0;
            for (int i = 1; i < a; i++){
                if (a % i == 0){
                    sum += i;
                }
            }

            if (sum == a) {
                System.out.print(a + " = 1");
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        System.out.print(" + " + i);
                    }
                }
                System.out.println();
            } else {
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}
