package org.coding.lv0.p181847;

import java.util.Arrays;

public class P181847 {
    public static void main(String[] args) {
        new Solution().solution("0080");
    }
}

class Solution {
    public String solution(String n_str) {
        String answer = "";
        n_str.split("");
        String[] strArr = new String[n_str.length()];
        boolean Zero = true;
        for (int i = 0; i < n_str.length(); i++){
            strArr[i] = Character.toString(n_str.charAt(i));
            if (strArr[i].equals("0") && Zero) {
                continue;
            }
            Zero = false;
            answer += strArr[i];
        }
        System.out.println(answer);
        return answer;
    }
}