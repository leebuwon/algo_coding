package org.coding.lv1.p70128;

public class P70128 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        new Solution().solution(a, b);
    }
}

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++){
            if (a.length == b.length){
                answer += a[i] * b[i];
            }
        }

        System.out.println(answer);
        return answer;
    }
}