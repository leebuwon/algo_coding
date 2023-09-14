package org.coding.lv1.p42576;

import java.util.Arrays;
import java.util.HashMap;

public class P42576 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        new Solution().solution(participant, completion);
    }
}


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++){
            if (!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }

        if (answer.isEmpty()){
            answer = participant[participant.length - 1];
        }

        return answer;
    }
}

/**
 * HashMap 풀이
 */
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) {
//            hm.put(player, hm.getOrDefault(player, 0) + 1);
//        }
//
//        for (String player : completion) {
//            hm.put(player, hm.get(player) - 1);
//        }
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
//    }
//}