package org.coding.inflearn;

import java.util.Scanner;

public class Inf2S04 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int x : solution(n)){
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++){
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }
}
