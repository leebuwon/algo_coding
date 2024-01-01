package org.coding.backJoon.bronze.p2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        solution(a, b, c);
    }

    private static void solution(int a, int b, int c) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;

        int multiple = a * b * c;

        String answer = String.valueOf(multiple);

        for (int i = 0; i < answer.length(); i++){
            if (answer.charAt(i) == '0'){
                zero++;
            } else if (answer.charAt(i) == '1') {
                one++;
            } else if (answer.charAt(i) == '2') {
                two++;
            } else if (answer.charAt(i) == '3') {
                three++;
            } else if (answer.charAt(i) == '4') {
                four++;
            } else if (answer.charAt(i) == '5') {
                five++;
            } else if (answer.charAt(i) == '6') {
                six++;
            } else if (answer.charAt(i) == '7') {
                seven++;
            } else if (answer.charAt(i) == '8') {
                eight++;
            } else if (answer.charAt(i) == '9') {
                nine++;
            }
        }

        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
    }

    /**
     * 리팩터링 코드
     */
    private static void solution2(int a, int b, int c) {
        int[] counts = new int[10];

        int multiple = a * b * c;
        String answer = String.valueOf(multiple);

        for (int i = 0; i < answer.length(); i++) {
            char digit = answer.charAt(i);
            if (Character.isDigit(digit)) {
                int index = digit - '0';
                counts[index]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(counts[i]);
        }
    }
}
