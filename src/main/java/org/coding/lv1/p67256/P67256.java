package org.coding.lv1.p67256;

import com.sun.security.jgss.GSSUtil;

public class P67256 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        new Solution().solution(numbers, "right");
    }
}

/**
 * chatGPT 도움 풀이
 * 혼자 해결하지 못했음!
 * 나중에 한번 더 풀이해보자
 */
class Solution {
    public String solution(int[] numbers, String hand) {
        // LRLLLRLLRRL
        StringBuilder answer = new StringBuilder();

        int left = 10;
        int right = 11;
        for (int i = 0; i < numbers.length; i++){
            int number = numbers[i];

            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                right = number;
            } else {
                int leftDistance = Distance(left, number);
                // 1
                // 1
                // 2
                // 1
                // 1
                System.out.println("leftDistance : " + leftDistance);
                int rightDistance = Distance(right, number);
                // 2
                // 3
                // 1
                // 1
                // 2
                System.out.println("rightDistance : " + rightDistance);

                if (leftDistance < rightDistance) {
                    left = number;
                    answer.append("L");
                } else if (leftDistance > rightDistance) {
                    right = number;
                    answer.append("R");
                } else {
                    if (hand.equals("left")) {
                        left = number;
                        answer.append("L");
                    } else {
                        right = number;
                        answer.append("R");
                    }
                }
            }
        }

        System.out.println(answer);

        return answer.toString();
    }

    private int Distance(int currentNumber, int nextNumber) {
        int[][] keypad = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 0, 11}
        };

        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (keypad[i][j] == currentNumber) {
                    x1 = i; // 2
                    y1 = j; // 2
                }
                if (keypad[i][j] == nextNumber) {
                    x2 = i; // 1
                    y2 = j; // 1
                }
            }
        }

        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
