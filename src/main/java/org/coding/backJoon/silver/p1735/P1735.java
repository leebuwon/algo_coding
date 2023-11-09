package org.coding.backJoon.silver.p1735;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr1 = new int[2];
        int[] arr2 = new int[2];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr1, arr2);
    }

    private static void solution(int[] arr1, int[] arr2) {

        int gcd = gcd(arr1[1], arr2[1]);
        int denominator = arr1[1] * arr2[1] / gcd;

        int aFountain = (denominator / arr1[1]) * arr1[0];
        int bFountain = (denominator / arr2[1]) * arr2[0];

        int sumFountain = aFountain + bFountain;

        // 분수와 분모 약분
        int num = gcd(sumFountain, denominator);
        sumFountain /= num;
        denominator /= num;

        System.out.print(sumFountain + " " + denominator);

    }

    private static int gcd(int num1, int num2) {
        while (num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }
}
