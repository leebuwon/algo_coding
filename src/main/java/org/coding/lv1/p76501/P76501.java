package org.coding.lv1.p76501;

public class P76501 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 12};
        boolean[] booleans = {true, false, true};
        new Solution().solution(arr, booleans);
    }
}


class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++){
            if (!signs[i]){
                answer -= absolutes[i];
            } else {
                answer += absolutes[i];
            }
        }

        System.out.println(answer);


        return answer;
    }
}