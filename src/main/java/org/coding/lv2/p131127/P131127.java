package org.coding.lv2.p131127;

import java.util.HashMap;
import java.util.Map;

public class P131127 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        new Solution().solution(want, number, discount);
    }
}


class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            wantMap.put(want[i], number[i]);
        }

        int start = 0;
        while (start + 10 <= discount.length){
            Map<String, Integer> discountMap = new HashMap<>();

            for (int i = start; i < start + 10 && i < discount.length; i++){
                discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0) + 1);
            }

            if (validDiscount(wantMap, discountMap)){
                answer++;
            }


            start++;
        }

        System.out.println(answer);
        return answer;
    }

    private boolean validDiscount(Map<String, Integer> wantMap, Map<String, Integer> discountMap) {
        for (String key : wantMap.keySet()) {
            if (!discountMap.containsKey(key)){
                return false;
            }

            int wantValue = wantMap.get(key);
            int discountValue = discountMap.get(key);

            if (discountValue < wantValue){
                return false;
            }
        }

        return true;
    }
}