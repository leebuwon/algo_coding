package org.coding.lv0.p181867;

import java.util.Arrays;

public class P181867 {
    public static void main(String[] args) {
        new Solution().solution("oxooxoxxox");
    }
}

class Solution {
    public int[] solution(String myString) {
        String[] splitStrings = myString.split("x");

        if (myString.charAt(myString.length() - 1) == 'x') {
            splitStrings = Arrays.copyOf(splitStrings, splitStrings.length + 1);
            splitStrings[splitStrings.length - 1] = "";
        }

        int[] answer = new int[splitStrings.length];
        for (int i = 0; i < splitStrings.length; i++) {
            answer[i] = splitStrings[i].length();
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}