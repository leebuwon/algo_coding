package org.coding.lv2.p70129;

import java.util.Collections;

public class P70129 {
    public static void main(String[] args) {
        new Solution().solution("110010101001");
    }
}

class Solution {
    int count = 0;
    int change = 0;
    public int[] solution(String s) {
        int[] answer = new int[2];
        int num = 0;

        while(num != 1){
            num = deleteZero(s);
            s = changeBinary(num);
        }

        answer[0] = change;
        answer[1] = count;


        return answer;
    }

    private String changeBinary(int num) {
        change++;
        if (num == 1){
            return "1";
        }

        // 이진법 변환
        String binary = Integer.toBinaryString(num);

        return binary;

        // 이진법 변환 (위에 로직을 인라인 시킨 것)
//        return Integer.toBinaryString(num);
    }

    public int deleteZero(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '0'){
                count++;
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.length();
    }
}