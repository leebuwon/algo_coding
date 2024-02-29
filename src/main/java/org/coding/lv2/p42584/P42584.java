package org.coding.lv2.p42584;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P42584 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        new Solution().solution(prices);
    }
}

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();

        for (int price : prices) {
            queue.add(price);
        }

        List<Integer> arr = new ArrayList<>();
        int index = 0;
        while (!queue.isEmpty()){
            int currentPrice = queue.poll();

            int count = 0;
            for (int i = index + 1; i < prices.length; i++){
                if (currentPrice <= prices[i]){
                    count++;
                } else {
                    count++;
                    break;
                }
            }

            index++;
            arr.add(count);
        }

        for (int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }


        return answer;
    }
}