package org.coding.lv1.p81301;

import java.util.ArrayList;
import java.util.List;

public class P81301 {
    public static void main(String[] args) {
        new Solution().solution("one4seveneight");
    }
}


class Solution {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9")
                .replace("zero", "0"));

        return answer;
    }
}