package org.coding.lv1.p160586;

import java.util.*;

public class P160586 {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
//        String[] keymap = {"AGZ", "BSSS"};
//        String[] targets = {"ASA","BGZ"};
        new Solution().solution(keymap, targets);
    }
}


class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < keymap.length; i++){
            String str = keymap[i];

            for (int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);

                Integer currentValue = hashMap.get(String.valueOf(ch));

                if (!hashMap.containsKey(String.valueOf(ch)) || currentValue > j) {
                    hashMap.put(String.valueOf(ch), j + 1);
                }
            }
        }

        if (hashMap.isEmpty()){
            answer[0] = -1;
            return answer;
        }

        for (int i = 0; i < targets.length; i++){
            String str = targets[i];

            for (char c : str.toCharArray()){
                if (!hashMap.containsKey(String.valueOf(c))) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += hashMap.get(String.valueOf(c));
            }

        }

        return answer;
    }
}