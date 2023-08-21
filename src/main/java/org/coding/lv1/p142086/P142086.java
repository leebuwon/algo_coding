package org.coding.lv1.p142086;

import java.util.ArrayList;
import java.util.List;

public class P142086 {
    public static void main(String[] args) {
        new Solution().solution("banana");
    }
}


class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<String> arrList = new ArrayList<>();
        String[] split = s.split("");

        for (int i = 0; i < split.length; i++){
            if (!arrList.contains(split[i])){
                arrList.add(split[i]);
                answer[i] = -1;
            } else {
                int lastIndex = arrList.lastIndexOf(split[i]);
                answer[i] = i - lastIndex;
                arrList.add(split[i]);
            }
        }

        return answer;
    }
}