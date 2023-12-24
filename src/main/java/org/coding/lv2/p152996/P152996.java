package org.coding.lv2.p152996;

import java.util.HashMap;
import java.util.Map;

public class P152996 {
    public static void main(String[] args) {
        int[] arr = {100,180,360,100,270};
        new Solution().solution(arr);
    }
}

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int weight : weights) {
            map.put(weight, map.getOrDefault(weight, 0) + 1);
        }

        for (int currentWeight : map.keySet()){
            for (int anotherWeight : map.keySet()){
                if (currentWeight == anotherWeight){
                    continue;
                }
                // 값 찾기!
                answer = getAnswer(answer, map, currentWeight, anotherWeight);
            }

            answer += (long) map.get(currentWeight) * (map.get(currentWeight) - 1) / 2;
        }

        System.out.println(answer);

        return answer;
    }

    private static long getAnswer(long answer, Map<Integer, Integer> map, int currentWeight, int anotherWeight) {
        int currentWeightValue = map.get(currentWeight);
        int anotherWeightValue = map.get(anotherWeight);

        // 1:2, 2:3, 3:4 조건
        if (currentWeight == anotherWeight * 2 || currentWeight * 2 == anotherWeight * 3 || currentWeight * 3 == anotherWeight * 4) {
            answer += (long) currentWeightValue * anotherWeightValue;
        }

        return answer;
    }
}