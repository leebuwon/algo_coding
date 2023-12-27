package org.coding.lv2.p17680;

import java.util.*;

public class P17680 {
    public static void main(String[] args) {
        int cache = 0;
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
//        String[] cities = { "seoul", "seoul", "seoul", "tokyo", "seoul", "tokyo" };
//        String[] cities = {"a", "b", "c", "b", "a"};
        String[] cities = {"a", "b", "c", "a"};
        new Solution().solution(cache, cities);
    }
}

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        Queue<String> queue = new LinkedList<>();

        for (String toCity : cities) {

            String city = toCity.toLowerCase();

            if (queue.contains(city)) {
                answer += 1;
                queue.remove(city);
                queue.add(city);
            } else {
                answer += 5;
                if (queue.size() >= cacheSize) {
                    queue.poll();
                }

                if (cacheSize != 0){
                    queue.add(city);
                }
            }
        }

        System.out.println(answer);

        return answer;
    }
}