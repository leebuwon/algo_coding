package org.coding.lv1.p138477;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P138477 {
    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        new Solution().solution(3, score);
    }
}


class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < score.length; i++){

            if (i < k){
                arr.add(score[i]);
                answer[i] = Collections.min(arr);
            }

            else {
                if (Collections.min(arr) < score[i]){
                    arr.add(score[i]);
                    arr.remove(Collections.min(arr));
                    answer[i] = Collections.min(arr);
                } else {
                    answer[i] = answer[i - 1];
                }
            }
        }

        return answer;
    }
}