package org.coding.lv2.p42842;

import java.util.Arrays;

public class P42842 {
    public static void main(String[] args) {
//        new Solution().solution(10, 2);
        new Solution().solution(24, 24);
    }
}


/**
 * 보고 풀이
 */
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = brown + yellow;
        int x = 0;
        int y = 0;

        int yellowX = 0;
        int yellowY = 0;

        // 완전탐색
        for (int i = 1; i <= yellow; i++){
            if (yellow % i == 0){
                yellowX = Math.max(i, yellow / i);
                yellowY = Math.min(i, yellow / i);
                // 가로와 세로에 각각 +2를 확장해야지 모든 yellow격자를 감쌀 수 있다.
                if ((yellowY + 2) * (yellowX + 2) == sum){
                    break;
                }
            }
        }

        x = yellowX + 2;
        y = yellowY + 2;

        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}