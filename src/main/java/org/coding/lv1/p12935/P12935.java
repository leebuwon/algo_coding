package org.coding.lv1.p12935;

import java.util.Arrays;

public class P12935 {
    public static void main(String[] args) {
//        int[] arr = {4,3,2,1};
        int[] arr = {10};
        new Solution().solution(arr);
    }
}


class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int[] removeMin = Arrays.stream(arr).filter(i -> i != min).toArray();

        if (removeMin.length == 0){
            int[] answer = new int[1];
            answer[0] += -1;
            return answer;

        }

        int[] answer = new int[removeMin.length];
        for (int i = 0; i < removeMin.length; i++){
            answer[i] += removeMin[i];
        }

        return answer;
    }
}