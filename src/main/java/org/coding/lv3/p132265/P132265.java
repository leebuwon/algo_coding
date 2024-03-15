package org.coding.lv3.p132265;

import java.util.HashMap;
import java.util.Map;

public class P132265 {
    public static void main(String[] args) {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        new Solution().solution(topping);
    }
}

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> leftMap = new HashMap<>();
        Map<Integer, Integer> rightMap = new HashMap<>();

        for (int currentTopping : topping){
            leftMap.put(currentTopping, leftMap.getOrDefault(currentTopping, 0) + 1);
        }

        for (int i = 0; i < topping.length; i++){
            int currentTopping = topping[i];
            rightMap.put(currentTopping, rightMap.getOrDefault(currentTopping, 0) + 1);

            if (leftMap.get(currentTopping) == 1){
                leftMap.remove(currentTopping);
            } else {
                leftMap.put(currentTopping, leftMap.get(currentTopping) - 1);
            }

            if (leftMap.size() == rightMap.size()){
                answer++;
            }
        }

        return answer;
    }
}