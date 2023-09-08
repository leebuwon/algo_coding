package org.coding.lv1.p17682;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P17682 {
    public static void main(String[] args) {
//        new Solution().solution("1S2D*3T");
//        new Solution().solution("1D2S#10S");
//        new Solution().solution("1S2D*3T");
        new Solution().solution("1S*2T*3S");
    }
}


class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] parts = dartResult.split("(?<=\\d)(?=[A-Z*#])|(?<=[A-Z*#])(?=\\d)"); // 숫자와 영문을 나눠서 정렬하는 정규화 방식
//        String[] parts = dartResult.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)"); // 숫자와 영문을 나눠서 정렬하는 정규화 방식
//        String[] parts = dartResult.split("(?<=\\D)(?=\\d)");
//        String[] parts = dartResult.split("(?<=\\d)(?=\\D)");

        System.out.println(Arrays.toString(parts));

        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < parts.length; i++){
            int number = 0;
            if (isNumber(parts[i])){
                number = Integer.parseInt(parts[i]);
                int score = whatSDT(parts[i + 1], number);
                arrList.add(score);
                System.out.println("*#하기전 score : " + arrList);
                if (parts[i + 1].contains("*")){
                    // 1 / 3 / 5
                    if (i == 0){
                        arrList.set(i, arrList.get(i) * 2);
                    } else if (i == 2){
                        arrList.set(0, arrList.get(0) * 2);
                        arrList.set(i - 1, arrList.get(i - 1) * 2);
                    } else if (i == 4){
                        arrList.set(i - 3, arrList.get(i - 3) * 2);
                        arrList.set(i - 2, arrList.get(i - 2) * 2);
                    }

                } else if (parts[i + 1].contains("#")){
                    if (i == 0){
                        arrList.set(i, arrList.get(i) * -1);
                    } else if (i == 2){
                        arrList.set(i - 1, arrList.get(i - 1) * -1);
                    } else if (i == 4){
                        arrList.set(i - 2, arrList.get(i - 2) * -1);
                    }
                }
            }
        }

        for (int i = 0; i < arrList.size(); i++){
            answer += arrList.get(i);
        }

        System.out.println("정답 : " + answer);

        return answer;
    }

    private int whatSDT(String part, int number) {
        if (part.startsWith("S")){
            return number;
        } else if (part.startsWith("D")){
            return number * number;
        } else if (part.startsWith("T")){
            return number * number * number;
        }

        return 0;
    }

    // 숫자인지 영문인지 판단해서 숫자면 true | 영문이면 false
    private boolean isNumber(String part) {
        return part.chars().allMatch(Character::isDigit);
    }
}