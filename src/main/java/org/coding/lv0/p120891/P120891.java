package org.coding.lv0.p120891;

public class P120891 {
    public static void main(String[] args) {
        new Solution().solution(0);
    }
}


class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Long.toString(order);
        for (int i = 0; i < str.length(); i++){
            long digit = Character.getNumericValue(str.charAt(i));
            if (digit == 0){
                System.out.println(answer);
                return answer;
            } else if (digit % 3 == 0){
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}