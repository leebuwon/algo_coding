package org.coding.inflearn;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Inf5S01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s = solution(str);
        System.out.println(s);
    }

    private static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if (x == '('){
                stack.push(x);
            } else {
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
