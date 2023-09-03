package org.coding.lv1.p42840;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P42840 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        int[] arr = {5, 5, 5, 5, 5, 5, 5, 5};
        new Solution().solution(arr);
    }
}

class Solution {
    public int[] solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<Integer> resultList = new ArrayList<>();

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i % num1.length]) { // num1의 배열크기를 벗어나지 않도록 설정
                score[0]++;
            }
            if (answers[i] == num2[i % num2.length]) {
                score[1]++;
            }
            if (answers[i] == num3[i % num3.length]) {
                score[2]++;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int x : score){
            max = Math.max(x, max);
        }

        int highScore = 0;
        for (int i = 0; i < score.length; i++){
            if (max == score[i]){
                highScore++;
            }
        }

        int[] answer = new int[highScore];
        int idx = 0;
        for (int i = 0; i < score.length; i++) {
            if (max == score[i]) {
                answer[idx] = i + 1;
                idx++;
            }
        }

        // Max값을 구하는 다른 방법
//        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
//
//        List<Integer> resultList = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            if (score[i] == maxScore) {
//                resultList.add(i + 1);
//            }
//        }
//
//        int[] answer = new int[resultList.size()];
//        for (int i = 0; i < resultList.size(); i++) {
//            answer[i] = resultList.get(i);
//        }

        return answer;
    }
}