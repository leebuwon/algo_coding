package org.coding.lv2.p42626;

import java.util.*;

public class P42626 {
    public static void main(String[] args) {
        int[] arr = {1};
        new Solution().solution(arr, 7);
    }
}

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;

        Arrays.sort(scoville);

        Queue<Integer> queue = new PriorityQueue<>();
        for (int num : scoville) {
            queue.add(num);
        }

        while (queue.size() > 1 && queue.peek() < K){
            int num = 0;
            if (queue.peek() < K){
                num = queue.poll();
            }

            if (queue.peek() != null && queue.peek() < K ){
                num += queue.remove() * 2;
            } else if (queue.peek() != null){
                num += queue.peek() * 2;
            }

            count++;
            queue.add(num);
            if (queue.peek() != null && queue.peek() >= K){
                break;
            }
        }

        if (queue.peek() < K){
            count = -1;
        }

        return count;
    }
}