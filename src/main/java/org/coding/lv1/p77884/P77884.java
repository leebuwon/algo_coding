package org.coding.lv1.p77884;

public class P77884 {
    public static void main(String[] args) {
        new Solution().solution(13, 17);
    }
}

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++){
            int sum = 0;

            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    sum++;
                }
            }

            // 짝수는 더하고 홀수는 뺴기
            if (sum % 2 ==0){
                answer += i;
            } else {
                answer -= i;
            }
        }

        System.out.println(answer);
        return answer;
    }
}