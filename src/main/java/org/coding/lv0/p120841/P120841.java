package org.coding.lv0.p120841;

public class P120841 {
    public static void main(String[] args) {
        int[] n = {3, 2};
        new Solution().solution(n);
    }
}

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0){
            answer = answer + 1;
        } else if (dot[0] < 0 && dot[1] > 0){
            answer = answer + 2;
        }else if (dot[0] < 0 && dot[1] < 0){
            answer = answer + 3;
        }else if (dot[0] > 0 && dot[1] < 0){
            answer = answer + 4;
        }
        return answer;
    }
}