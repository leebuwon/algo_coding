package org.coding.lv0.p120904;

public class P120904 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        for (int i = 0; i < str.length();i ++){
            int digit = Character.getNumericValue(str.charAt(i));
            if (digit == k){
                answer = i + 1;
                System.out.println(answer);
                break;
            } else if(digit != k){
                answer = -1;
            }
        }
        return answer;
    }
}