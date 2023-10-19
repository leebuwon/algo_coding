package org.coding.lv2.p12981;

import java.util.*;

public class P12981 {
    public static void main(String[] args) {
//        String[] str = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] str = {"hello", "one", "even", "never", "now", "world", "draw"};
        new Solution().solution(2, str);
    }
}

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> strList = new ArrayList<>();

        int count = 0;
        for(int i = 0; i < words.length; i++){
            if(strList.contains(words[i])){
                count = i + 1;
                break;
            } else if (!strList.isEmpty()) {
                String str = strList.get(strList.size() - 1);
                char c = str.charAt(str.length() - 1);
                if (words[i].charAt(0) != c){
                    count = i + 1;
                    break;
                }
            }


            strList.add(words[i]);
        }

        if (count == 0){
            return answer;
        }

        answer[0] = (count - 1) % n + 1;
        answer[1] = (count - 1) / n + 1;

        return answer;
    }
}