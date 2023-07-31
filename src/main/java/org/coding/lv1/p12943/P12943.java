package org.coding.lv1.p12943;

public class P12943 {
    public static void main(String[] args) {
        new Solution().solution(6);
    }
}

class Solution {
    public long solution(long num) {
        long answer = 0;
        long result = num;

        while (result != 1){
            if (answer == 500){
                answer = -1;
                break;
            }

            if (result % 2 == 0){
                result = result / 2;
            } else {
                result = result * 3 + 1;
            }

            answer++;
        }


        System.out.println(answer);
        return answer;
    }
}