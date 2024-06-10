package org.coding.lv0.p250128;

public class P250128 {
    public static void main(String[] args) {
        int[] numbers = {3, 4};
        int[] our_score = {85, 93};
        int[] score_list = {85, 92, 38, 93, 48, 85, 92, 56};
        new Solution().solution(numbers, our_score, score_list);
    }
}

class Solution {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}

