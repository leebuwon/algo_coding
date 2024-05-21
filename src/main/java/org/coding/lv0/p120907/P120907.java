package org.coding.lv0.p120907;

import java.util.Arrays;

public class P120907 {
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        new Solution().solution(quiz);
    }
}


class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];


        for(int i = 0; i < quiz.length; i++){
            String[] str = quiz[i].split(" ");

            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[2]);
            int num3 = Integer.parseInt(str[4]);


            if(str[1].equals("-")){
                if(num1 - num2 == num3){
                    answer[i] = "O";
                } else{
                    answer[i] = "X";
                }
            } else{
                if(num1 + num2 == num3){
                    answer[i] = "O";
                } else{
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }
}