package org.coding.lv2.p154539;

import java.util.*;

public class P154539 {
    public static void main(String[] args) {
        int[] arr = {9, 1, 5, 3, 6, 2};
//        int[] arr = {2, 3, 3, 5};
        new Solution().solution(arr);
    }
}

class Solution {
    public int[] solution(int[] numbers){
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = numbers.length - 1; i >= 0; i--){
            while (!stack.isEmpty() && stack.peek() <= numbers[i]){
                stack.pop();
            }

            if (!stack.isEmpty()){
                answer[i] = stack.peek();
            } else {
                answer[i] = -1;
            }

            stack.push(numbers[i]);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

/**
 * 시간 초과 20, 21, 22, 23
 */
/*
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            for (int j = i; j < numbers.length; j++){
                if (num < numbers[j]){
                    num = numbers[j];
                    break;
                }
            }
            if (numbers[i] == num){
                num = -1;
            }

            answer[i] = num;
        }

        return answer;
    }
}*/
