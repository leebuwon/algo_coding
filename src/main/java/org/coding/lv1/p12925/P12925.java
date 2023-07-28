package org.coding.lv1.p12925;

import javax.swing.text.html.parser.Parser;

public class P12925 {
    public static void main(String[] args) {
        new Solution().solution("-1234");
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        System.out.println(answer);
        return answer;
    }
}