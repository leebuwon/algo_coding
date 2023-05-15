package org.coding.lv0.p181900;

import java.util.Arrays;

public class P181900 {
    public static void main(String[] args) {
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        new Solution().solution("apporoograpemmemprs", indices);
    }
}

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] splitString = my_string.split("");
        for (int i = 0; i < indices.length; i++){
            splitString[indices[i]] = "";
        }
        System.out.println(Arrays.toString(splitString));

        for (int i = 0; i < splitString.length; i++) {
            if (!splitString[i].equals("")) { // 인덱스가 ""가 아닌 것만 answer에 담아준다.
                answer += splitString[i];
            }
        }
        return answer;
    }
}
