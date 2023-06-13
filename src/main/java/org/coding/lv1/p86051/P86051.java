package org.coding.lv1.p86051;

public class P86051 {
    public static void main(String[] args) {
        int[] arr = {3,4,1,5,6,7,8,9,0};
        new Solution().solution(arr);
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int total = 0;
        for (int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }
        answer = 45 - total;

        System.out.println(answer);
        return answer;
    }
}