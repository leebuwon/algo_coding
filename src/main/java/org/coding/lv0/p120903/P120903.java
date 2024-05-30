package org.coding.lv0.p120903;

public class P120903 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String str : s1) {
            for (String s : s2) {
                if (str.equals(s)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}