package org.coding.lv0.p120826;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        my_string = my_string.replaceAll(letter, "");
        answer = my_string;
        return answer;
    }
}