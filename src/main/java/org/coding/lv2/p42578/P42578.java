package org.coding.lv2.p42578;

import java.util.*;

public class P42578 {
    public static void main(String[] args) {
        String[][] str = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        new Solution().solution(str);
    }
}

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++){
            if (map.containsKey(clothes[i][1])) {
                map.get(clothes[i][1]).add(clothes[i][0]);
            } else {
                List<String> clothingList = new ArrayList<>();
                clothingList.add(clothes[i][0]);
                map.put(clothes[i][1], clothingList);
            }
        }

        for (String key : map.keySet()) {
            int count = map.get(key).size() + 1;
            answer *= count;
        }

        answer--;

        System.out.println(answer);
        return answer;
    }
}