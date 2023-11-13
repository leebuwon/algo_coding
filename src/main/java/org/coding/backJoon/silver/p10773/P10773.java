package org.coding.backJoon.silver.p10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (num > 0) {
                stack.add(num);
            }

            if (num == 0 && !stack.isEmpty()) {
                stack.pop();
            }
        }

        int sum = 0;
        for (int num : stack){
            sum += num;
        }

        System.out.println(sum);

    }
}
