package org.coding.lv2.p12909;

import java.util.Stack;

public class P12909 {
    public static void main(String[] args) {
//        new Solution().solution("()()");
        new Solution().solution(")()(");
//        new Solution().solution("(())()");
//        new Solution().solution("(()()");
    }
}


class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> stacks = new Stack<>();


        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '('){
                stacks.push(String.valueOf(c));
            } else if (stacks.isEmpty() && c == ')'){
                return false;
            } else {
                stacks.pop();
            }
        }

        if (!stacks.isEmpty()){
            answer = false;
        }

        System.out.println(answer);



        /**
         * 틀린 방법
         * (()) 이렇게 들어오면 스택이 잘 활용되야 하는데 현재는 peek으로 같기 때문에 해결되지 않는다.
         */
//        for(int i = 0; i < s.length(); i++){
//            if(stacks.isEmpty() && anoStacks.peek().equals(")")){
//                stacks.push(anoStacks.pop());
//            } else if(stacks.isEmpty() && anoStacks.peek().equals("(")){
//                return false;
//            } else if(!stacks.isEmpty() && stacks.peek().equals(anoStacks.peek())){
//                return false;
//            } else {
//                stacks.push(anoStacks.pop());
//            }
//        }

        return answer;
    }
}