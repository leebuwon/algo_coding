package org.coding.backJoon.bronze.p5585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution(n);
    }

    private static void solution(int n) {

        int receive = 1000 - n;

        int count = 0;
        while (receive != 0){
            if (receive >= 500){
                count += receive / 500;
                receive %= 500;
            } else if (receive >= 100) {
                count += receive / 100;
                receive %= 100;
            } else if (receive >= 50) {
                count += receive / 50;
                receive %= 50;
            } else if (receive >= 10) {
                count += receive / 10;
                receive %= 10;
            } else if (receive >= 5) {
                count += receive / 5;
                receive %= 5;
            } else if (receive >= 1) {
                count += receive;
                receive %= 1;
            }
        }

        System.out.println(count);
    }
}
