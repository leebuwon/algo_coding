package org.coding.lv1.p87389;

public class P87389 {
    public static void main(String[] args) {
        new Solution().solution(10);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++){
            answer++;
            if (n % answer == 1){
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}