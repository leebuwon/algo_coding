package org.coding.backJoon.silver.p1874;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }

    /**
     * 책 풀이
     */
//    private static String solution(int n, int[] arr) {
//        Stack<Integer> stack = new Stack<>();
//        StringBuffer bf = new StringBuffer();
//        int num = 1;
//        boolean result = true;
//
//        for (int i = 0; i < arr.length; i++){
//            int su = arr[i];
//            if (su >= num){
//                while (su >= num){
//                    stack.push(num++);
//                    bf.append("+\n");
//                }
//                stack.pop();
//                bf.append("-\n");
//            }
//            else {
//                int m = stack.pop();
//                if (m > su){
//                    System.out.println("NO");
//                    result = false;
//                    break;
//                } else {
//                    bf.append("-\n");
//                }
//            }
//        }
//        return bf.toString();
//    }

    private static String solution(int n, int[] arr) {
        StringBuilder answer = new StringBuilder();

        Stack<Integer> stacks = new Stack<>();
        int temp = 1;
        for (int i = 0; i < n; i++){
            while (stacks.isEmpty() || arr[i] > stacks.peek()) {
                stacks.add(temp);
                temp++;
                answer.append("+").append("\n");
            }

            if (stacks.peek() == arr[i]){
                answer.append("-").append("\n");
                stacks.pop();
            }
        }

        if (!stacks.isEmpty()){
            return "NO";
        }

        return answer.toString();
    }
}
