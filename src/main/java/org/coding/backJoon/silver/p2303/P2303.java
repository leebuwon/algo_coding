package org.coding.backJoon.silver.p2303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2303 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[][] cards = new int[n][5];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++){
                cards[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(cards);
    }

    private static void solution(int[][] cards) {
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length - 2; j++) {
                int currentNum = cards[i][j];

                for (int k = j + 1; k < cards[i].length - 1; k++) {
                    for (int l = k + 1; l < cards[i].length; l++) {
                        int sum = currentNum + cards[i][k] + cards[i][l];
                        int answer = sum % 10;

                        if (answer > max || (answer == max && i > index)) {
                            max = answer;
                            index = i;
                        }
                    }
                }
            }
        }

        System.out.println(index + 1);
    }
}
