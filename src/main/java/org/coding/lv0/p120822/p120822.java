package org.coding.lv0.p120822;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class p120822 {
    public static void main(String[] args) {
        new Solution().solution("jaron");
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--){
            answer += String.valueOf(my_string.charAt(i));
        }
        return answer;
    }
}