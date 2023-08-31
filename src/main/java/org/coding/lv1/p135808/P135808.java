package org.coding.lv1.p135808;

import java.util.*;

public class P135808 {
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 1, 2, 3, 1};
//        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        new Solution().solution(3, 4, score);
    }
}

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 배열 내림차순 정렬
        Integer[] integers = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(integers, Collections.reverseOrder());

        List<Integer> arrList = new ArrayList<>();
        int point = 0;
        int sum = 0;

        for (int i = point; i < score.length; i++){
            arrList.add(integers[i]);
            if (arrList.size() >= m){
                Integer min = Collections.min(arrList);
                sum += min * m;
                arrList.clear();
            }
        }

        answer = sum;
        System.out.println(answer);

        return answer;
    }
}