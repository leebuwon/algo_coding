package org.coding.lv2.p12911;

public class P12911 {
    public static void main(String[] args) {
        new Solution().solution(78);
    }
}


class Solution {
    public int solution(int n) {
        int answer = 0;

        int count = 0; // 현재 n의 갯수를 카운트해주기 위해서 선언
        String binary = changeBinary(n);
        count = countOne(binary);


        boolean flag = true;
        int minValue;
        while(flag){
            String str = changeBinary(++n);
            minValue = countOne(str);
            if(count == minValue){
                flag = false;
            }
        }

        answer += n;

        return answer;
    }

    private String changeBinary(int n) {
        String binary = Integer.toBinaryString(n);
        return binary;
    }

    private int countOne(String str) {

        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '1'){
                sum++;
            }
        }

        return sum;

    }
}