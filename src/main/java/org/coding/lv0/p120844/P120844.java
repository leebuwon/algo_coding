package org.coding.lv0.p120844;

import java.util.Arrays;

public class P120844 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4};
        new Solution().solution(n, "right");
    }
}

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")){
            int temp = numbers[numbers.length - 1];
            for (int i = numbers.length -1; i > 0; i--){
                // number[3] = number[2] -> {1, 2, 3, 3}
                // number[2] = number[1] -> {1, 2, 2, 3}
                // number[1] = number[0] -> {1, 1, 2, 3}
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = temp; // {4, 1, 2, 3}
        } else if (direction.equals("left")) {
            int temp = numbers[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = temp;
        }
        answer = numbers;

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}