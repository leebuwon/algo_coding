package org.coding.lv1.p12915;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12915 {
    public static void main(String[] args) {
//        String[] strings = {"sun", "bud", "car"};
        String[] strings = {"abce", "abcd", "cdx"};
        new Solution().solution(strings, 2);
    }
}


class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++){
            String temp = "";
            for (int j = 0; j < strings.length; j++){
                if (strings[i].charAt(n) < strings[j].charAt(n)){
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }

                if (strings[i].charAt(n) == strings[j].charAt(n)){
                    if (strings[i].compareTo(strings[j]) < 0) {
                        temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < strings.length; i++){
            answer[i] = strings[i];
        }


        return answer;
    }
}