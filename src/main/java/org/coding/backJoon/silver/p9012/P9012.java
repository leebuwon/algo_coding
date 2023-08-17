package org.coding.backJoon.silver.p9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            System.out.println(solution(br.readLine()));
        }
    }

    private static String solution(String str) {
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()){
            if (x == '('){
                stack.push(x);
            }else {
                if (stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()){
            return "NO";
        }

        return "YES";
    }
}
