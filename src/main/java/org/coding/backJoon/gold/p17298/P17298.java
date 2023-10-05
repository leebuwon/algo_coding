package org.coding.backJoon.gold.p17298;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, arr);

    }

    /**
     * 책 풀이
     */
//    private static void solution(int n, int[] arr) throws IOException {
//        int[] answer = new int[n];
//        Stack<Integer> stack = new Stack<>();
//        stack.push(0);
//
//        for (int i = 1; i < n; i++){
//            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]){
//                answer[stack.pop()] = arr[i];
//            }
//            stack.push(i);
//        }
//        while (!stack.isEmpty()){
//            answer[stack.pop()] = -1;
//        }
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for (int i = 0; i < n; i++){
//            bw.write(answer[i] + " ");
//        }
//        bw.write("\n");
//        bw.flush();
//    }

    /**
     * 시간 초과 걸림
     * 이중 for문이라 그런거같음.
     * N이 1.000.000 이상 주어질때는 이중 for문 쓰면 시간 초과에 걸린다.
     */
    private static void solution(int n, int[] arr) throws IOException {
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++){
            int current = arr[i];
            for (int j = i; j < n; j++){
                if (current < arr[j]){
                    stack.push(arr[j]);
                    break;
                } else if (j == n - 1){
                    stack.add(-1);
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = stack.isEmpty() ? -1 : stack.pop();
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++){
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
