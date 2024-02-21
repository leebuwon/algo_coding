package org.coding.lv2.p142085;

import java.util.Collections;
import java.util.PriorityQueue;

public class P142085 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 3, 3, 1};
        new Solution().solution(7, 3, arr);
    }
}

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int e : enemy) {
            pq.add(e);
            n -= e;

            while (n < 0 && k > 0 && !pq.isEmpty()) {
                n += pq.poll();
                k--;
            }

            if (n < 0) {
                break;
            }

            answer++;
        }

        return answer;
    }
}