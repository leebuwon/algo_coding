package org.coding.lv1.p133499;

import java.util.*;

public class P133499 {
    public static void main(String[] args) {
//        String[] str = {"aya", "yee", "u", "maa"};
        String[] str = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        new Solution().solution(str);
    }
}

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++){
            String word = babbling[i];
            for (int j = 0; j < str.length; j++){
                String current = str[j];
                StringBuilder sb = new StringBuilder();
                sb.append(current).append(current);
                String newWord = sb.toString();

                if (!word.contains(newWord)){
                    word = word.replace(current, " ");
                }
            }

            if (word.trim().length() == 0){
                answer++;
            }
        }


        System.out.println(answer);
        return answer;
    }
}