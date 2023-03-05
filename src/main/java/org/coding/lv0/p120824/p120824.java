package org.coding.lv0.p120824;

import java.util.Arrays;

public class p120824 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        new Solution().solution(n);
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 0; i < num_list.length; i++){
            if (num_list[i] % 2 == 0){
                evenNumber++;
            }else oddNumber++;
        }

        answer[0] = evenNumber; // 0번쨰 인덱스에 짝수 저장
        answer[1] = oddNumber; // 1번쨰 인덱스에 홀수 저장

        return answer;
    }
}
