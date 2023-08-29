package org.coding.inflearn;

import java.util.Scanner;

public class Inf2S02 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        int solution = solution(n, arr);
        System.out.println(solution);
    }

    private static int solution(int n, int[] arr) {
        int answer = 1;
        int maxTall = arr[0];

        for (int i = 1; i < n; i++){

            if (arr[i] > maxTall){
                maxTall = arr[i];
                answer++;
            }

        }
        return answer;
    }
}
