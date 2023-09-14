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
//        // 우선 key값을 넣으면서 value를 등장한 참여자는 1을 더 해준다.
//        for (String player : participant) {
//            hm.put(player, hm.getOrDefault(player, 0) + 1);
//        }
//
//        // 완주한 선수들은 key값으로 찾아 -1해주어 0을 만들어준다.
//        for (String player : completion) {
//            hm.put(player, hm.get(player) - 1);
//        }
//
//        // 만약에 0이 아니라면 참여는 하였지만 완주를 하지 못했기 떄문에 answer에 넣어서 리턴해준다.
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
//    }
//}