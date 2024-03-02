package org.coding.lv2.p17684;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P17684 {
    public static void main(String[] args) {
        new Solution().solution("KAKAO");
    }
}


class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        int nextNum = 27;

        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        for (int i = 0; i < msg.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(msg.charAt(i));

            while ((i + 1) < msg.length() && map.containsKey(sb.toString() + msg.charAt(i + 1))) {
                sb.append(msg.charAt(++i));
            }

            arr.add(map.get(sb.toString()));

            if ((i + 1) < msg.length()) {
                map.put(sb.toString() + msg.charAt(i + 1), nextNum++);
            }
        }

        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}