package org.coding.lv2.p42583;

import java.util.LinkedList;
import java.util.Queue;

public class P42583 {
    public static void main(String[] args) {
        int[] truck_weights = {7, 4, 5, 6};
        new Solution().solution(2, 10, truck_weights);
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> truckQueue = new LinkedList<>();
        Queue<Integer> passTruck = new LinkedList<>();
        Queue<Integer> time = new LinkedList<>();

        for (int truck_weight : truck_weights) {
            truckQueue.add(truck_weight);
        }

        int currentWeight = 0;

        while (!truckQueue.isEmpty() || !passTruck.isEmpty()) {
            if (!time.isEmpty() && answer == time.peek() + bridge_length) {
                currentWeight -= passTruck.poll();
                time.poll();
            }

            if (!truckQueue.isEmpty() && currentWeight + truckQueue.peek() <= weight) {
                currentWeight += truckQueue.peek();
                passTruck.add(truckQueue.poll());
                time.add(answer);
            }

            answer++;
        }

        System.out.println(answer);

        return answer;
    }
}