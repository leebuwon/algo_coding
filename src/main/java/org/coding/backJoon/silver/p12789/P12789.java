package org.coding.backJoon.silver.p12789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class P12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int num : arr){
            queue.add(num);
        }

        int count = 1;
        while (!queue.isEmpty()){
            // 빠져야할 사람이랑 맞지 않을 경우 Stack 영역으로!
            if (queue.peek() != count){
                stack.add(queue.poll());
            } else {
                count++;
                answerList.add(queue.poll());
                // Stack 맨위가 다음 번호 일 경우 빼주기
                while (!stack.isEmpty() && stack.peek() == count){
                    count++;
                    answerList.add(stack.pop());
                }
            }
        }

        int size = stack.size();
        for (int i = 0; i < size; i++){
            answerList.add(stack.pop());
        }

        String answer = "Nice";
        for (int i = 0; i < answerList.size(); i++){
            if (answerList.get(i) != i + 1){
                answer = "Sad";
                break;
            }
        }


        System.out.println(answer);
    }
}