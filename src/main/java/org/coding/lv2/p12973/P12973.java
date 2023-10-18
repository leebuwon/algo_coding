package org.coding.lv2.p12973;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P12973 {
    public static void main(String[] args) {
//        new Solution().solution("baabaa");
        new Solution().solution("baaba");
    }
}

class Solution {
    public int solution(String s) {
        int answer = 1;
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(String.valueOf(s.charAt(i)));
            } else {
                if (stack.peek().equals(String.valueOf(s.charAt(i)))){
                    stack.pop();
                } else {
                    stack.push(String.valueOf(s.charAt(i)));
                }
            }
        }

        if (stack.size() == 0) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}

    /**
     * 실패
     * remove는 시간복잡도가 O(n) 이라 불가능..
     */
//    public int solution(String s) {
//        int answer = 1;
//
//        if (s.length() % 2 != 0){
//            return 0;
//        }
//
//        List<String> strList = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            strList.add(String.valueOf(s.charAt(i)));
//        }
//
//        int i = 0;
//        while (i < strList.size() - 1) {
//            String currentStr = strList.get(i);
//            String nextStr = strList.get(i + 1);
//
//            if (currentStr.equals(nextStr)) {
//                strList.remove(i);
//                strList.remove(i);
//                i = 0;
//            } else {
//                i++;
//            }
//        }
//
//        if (strList.size() == 0){
//            answer = 1;
//        } else {
//            answer = 0;
//        }
//
//        return answer;
//    }
