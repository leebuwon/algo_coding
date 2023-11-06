package org.coding.lv2.p76502;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P76502 {
    public static void main(String[] args) {
//        String str = "[](){}";
        String str = "[)(]";
        new Solution().solution(str);
    }
}


class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            queue.add(String.valueOf(c));
        }

        for(int i = 0; i < queue.size(); i++){
            if(i >= 1){
                queue.add(queue.poll());
            }
            int num = goStack(queue);
            answer += num;
        }

        System.out.println(answer);

        return answer;
    }

    private int goStack(Queue<String> queue){
        StringBuilder sb = new StringBuilder();
        // Queue는 Collection이라 공유가 된다. (주소 참조)
        Queue<String> copyQueue = new LinkedList<>(queue);

        while (!copyQueue.isEmpty()){
            sb.append(copyQueue.poll());
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        if (!stack.isEmpty()){
            return 0;
        }

        return 1;
    }
}