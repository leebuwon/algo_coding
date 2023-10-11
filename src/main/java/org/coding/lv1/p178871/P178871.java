package org.coding.lv1.p178871;

import java.util.*;

public class P178871 {
    public static void main(String[] args) {
        String[] runner = {"mumu", "soe", "poe", "kai", "mine"};
        String[] announcer = {"kai", "kai", "mine", "mine"};
        new Solution().solution(runner, announcer);
    }
}

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        Map<String, Integer> maps = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            maps.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++){
            String player = callings[i];
            int rank = maps.get(player);
            String beforePlayer = players[rank - 1];

            // swap
            players[rank - 1] = player;
            players[rank] = beforePlayer;

            maps.put(player, rank - 1);
            maps.put(beforePlayer, rank);

        }

        return answer;
    }
}