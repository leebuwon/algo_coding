package org.coding.lv0.p181854;

import java.util.Arrays;

public class P181854 {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 10};
        new Solution().solution(arr, 10);
    }
}


class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            // arr.length가 홀수라면
            if (arr.length % 2 != 0){
                if (i % 2 == 0){
                    arr[i] += n;
                }
            }
            // arr.length가 짝수라면
            else if (arr.length % 2 == 0) {
                if (i % 2 != 0){
                    arr[i] += n;
                }
            }
            answer[i] = arr[i];
        }

        System.out.println(Arrays.toString(answer) + " ");
        return answer;
    }
}