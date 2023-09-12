package org.coding.lv1.p77484;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P77484 {
    public static void main(String[] args) {
//        int[] arr = {44, 1, 0, 0, 31, 25};
        int[] arr = {0, 0, 0, 0, 0, 0};
        int[] nums = {31, 10, 45, 1, 6, 19};
        new Solution().solution(arr, nums);
    }
}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < win_nums.length; i++){
            arrList.add(win_nums[i]);
        }

        for (int i = 0; i < lottos.length; i++){
            if (arrList.contains(lottos[i])){
                answer[0]++;
                answer[1]++;
            }

            if (lottos[i] == 0){
                answer[0]++;
            }
        }

        for (int i = 0; i < answer.length; i++){
            if (answer[i] == 6){
                answer[i] = 1;
            } else if (answer[i] == 5){
                answer[i] = 2;
            } else if (answer[i] == 4){
                answer[i] = 3;
            } else if (answer[i] == 3){
                answer[i] = 4;
            } else if (answer[i] == 2){
                answer[i] = 5;
            } else {
                answer[i]= 6;
            }
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
