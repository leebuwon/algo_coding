package org.coding.lv2.p42883;

import java.util.*;

public class P42883 {
    public static void main(String[] args) {
        new Solution().solution("1924", 2);
        new Solution().solution("1231234", 3);
        new Solution().solution("9876543214", 4);
    }
}

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() < c){
                stack.pop();
                k--;
            }

            stack.add(c);
        }

        while (k != 0){
            stack.pop();
            k--;
        }

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}