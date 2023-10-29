package org.coding.lv2.p138476;

import java.util.*;

public class P138476 {
    public static void main(String[] args) {
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
//        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
//        int[] tangerine = {1};
        new Solution().solution(1, tangerine);
    }
}


class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);

        Map<Integer, Integer> maps = new HashMap<>();
        for(int i = 0; i < tangerine.length; i++){
            if(maps.containsKey(tangerine[i])){
                int value = maps.get(tangerine[i]);
                maps.put(tangerine[i], value + 1);
            } else {
                maps.put(tangerine[i], 1);
            }
        }
        // 간략하게 한 버전
//            for (int i = 0; i < tangerine.length; i++) {
//                maps.put(tangerine[i], maps.getOrDefault(tangerine[i], 0) + 1);
//            }

//        List<Integer> arrList = new ArrayList<>();
//        Set<Integer> keys = maps.keySet();
//        for (Integer key : keys) {
//            int value = maps.get(key);
//            arrList.add(value);
//        }
        // 위의 코드를 간략하게 한 버전
        List<Integer> arrList = new ArrayList<>(maps.values());

        arrList.sort(Collections.reverseOrder());

        int sum = 0;
        for (Integer integer : arrList) {
            answer++;
            sum += integer;
            if (k <= sum) {
                break;
            }
        }

        return answer;
    }
}