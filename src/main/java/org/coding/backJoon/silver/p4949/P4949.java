package org.coding.backJoon.silver.p4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String str = br.readLine();

            if (str.equals(".")){
                break;
            }

            String solution = solution(str);

            System.out.println(solution);
        }
    }

    private static String solution(String str) {
        // ( [ ) ] ) .
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '(' || str.charAt(i) == '['){
                stack.add(String.valueOf(str.charAt(i)));
            } else if (!stack.isEmpty() && (str.charAt(i) == ')' || str.charAt(i) == ']')) {
                if (stack.peek().equals("(") && str.charAt(i) == ')'){
                    stack.pop();
                }else if (!stack.isEmpty() && (stack.peek().equals("[") && str.charAt(i) == ']')){
                    stack.pop();
                } else {
                    stack.add(String.valueOf(str.charAt(i)));
                }
            } else if (str.charAt(i) == ')' || str.charAt(i) == ']') {
                stack.add(String.valueOf(str.charAt(i)));

            }

        }

        if (stack.isEmpty()){
            return "yes";
        }

        return "no";
    }
}
