package org.coding.lv1.p133502;

import java.util.*;

public class P133502 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2, 3, 1, 2, 3, 1};
//        int[] arr = {1,2,3,1,1};
//        int[] arr = {2,3,1,2};
//        int[] arr = {2,3};
//        int[] arr = {2, 1, 2, 3, 1, 2, 3, 1, 1};
//        int[] arr = {1, 2, 3, 1, 2, 3, 1, 1};
//        int[] arr = {2, 1, 2, 1, 1, 2, 3, 1, 2, 3, 1};
//        int[] arr = {1, 1, 1, 1, 1, 2, 3, 1, 2, 3, 2};
//        int[] arr = {1, 2, 3, 1, 1, 2, 3, 1};
//        int[] arr = {1,2,3,1};
//        int[] arr = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
        new Solution().solution(arr);
    }
}

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] hamburger = {1, 3, 2, 1};
        Stack<Integer> stack = new Stack<>();

        for (int num : ingredient) {
            stack.add(num);
            if (stack.size() >= hamburger.length){
                boolean flag = true;
                for (int i = 0; i < hamburger.length; i++){
                    if (stack.get(stack.size() - 1 - i) != hamburger[i]){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    for (int i = 0; i < hamburger.length; i++) {
                        stack.pop();
                    }
                    answer++;
                }
            }
        }

        return answer;
    }
}



/**
 * 성능 문제
 */
//class Solution {
//    public int solution(int[] ingredient) {
//        int answer = 0;
//        int[] hamburger = {1, 2, 3, 1};
//
//        List<Integer> arrList = new ArrayList<>();
//        for (int num : ingredient) {
//            arrList.add(num);
//        }
//
//        int num = 0;
//        while (num < arrList.size() - 3) {
//            boolean flag = true;
//            for (int i = 0; i < hamburger.length; i++) {
//                if (arrList.get(num + i) != hamburger[i]) {
//                    flag = false;
//                    break;
//                }
//            }
//
//            if (flag) {
//                for (int i = 0; i < hamburger.length; i++) {
//                    arrList.remove(num);
//                }
//                answer++;
//                num = 0;
//            } else {
//                num++;
//            }
//        }
//
//        System.out.println("답 : " + answer);
//
//        return answer;
//    }
//}

/**
 * 풀이 법
 */
//class Solution {
//    static Stack<Integer> stk = new Stack<>(); // main stack
//    static Stack<Integer> ttk = new Stack<>(); // temporary stack
//
//    private static final int[] bgr = {1, 3, 2, 1}; // burger recipe
//
//    public int solution(int[] ingredient) {
//        int answer = 0;
//        for (int i : ingredient) {
//            stk.add(i);
//            if (stk.size() < 4 || stk.peek() != 1)
//                continue;
//            boolean isBurger = true;
//            for (int j = 0; j < 4; j++) {
//                if (stk.peek() != bgr[j]) {
//                    isBurger = false;
//                    break;
//                }
//                ttk.push(stk.pop());
//            }
//            if (!isBurger) {
//                while (!ttk.isEmpty())
//                    stk.push(ttk.pop());
//            } else {
//                while (!ttk.isEmpty())
//                    ttk.pop();
//                ++answer;
//            }
//        }
//
//        System.out.println(answer);
//        return answer;
//    }
//}