package org.coding.lv0.p181916;

import java.util.ArrayList;
import java.util.List;

public class P181916 {
    public static void main(String[] args) {
//        new Solution().solution(2, 2, 2, 2);
//        new Solution().solution(4, 4, 1, 4);
//        new Solution().solution(6, 4, 2, 5);
//        new Solution().solution(6, 3, 3, 6);
//        new Solution().solution(6, 3, 2, 6);
        new Solution().solution(1, 1, 5, 5);
    }
}


class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        List<Integer> arrList = new ArrayList<>();
        arrList.add(a);
        arrList.add(b);
        arrList.add(c);
        arrList.add(d);

        int max = Integer.MIN_VALUE;
        int maxCounter = 0;
        int notMaxCounter = 0;

        for(int i = 0; i < arrList.size(); i++){
            int current = arrList.get(i);
            int sum = 0;
            for(int j = 0; j < arrList.size(); j++) {
                if (current == arrList.get(j)) {
                    sum++;
                }
            }
            if (sum > max){
                max = sum;
                maxCounter = current;
            }
        }

        for (int i = 0; i < arrList.size(); i++){
            if (maxCounter != arrList.get(i)){
                notMaxCounter = arrList.get(i);
            }
        }

        // 4개가 일치할 경우
        if (max == 4) {
            answer = 1111 * maxCounter;
        }

        // 3개가 일치할 경우
        if (max == 3){
            answer = (10 * maxCounter + notMaxCounter) * (10 * maxCounter + notMaxCounter);
        }

        // 2개가 일치할 경우
        int anotherMax = 0;
        int moreNumber = 0;
        if (max == 2){
            for (int i = 0; i < arrList.size(); i++){
                if (arrList.get(i) != maxCounter) {
                    if (arrList.get(i) != notMaxCounter) {
                        moreNumber = arrList.get(i);
                    }
                }
                if (arrList.get(i) == notMaxCounter){
                    anotherMax++;
                }
            }
            if (anotherMax == max){
                answer = (maxCounter + notMaxCounter) * (maxCounter - notMaxCounter);
                int abs = Math.abs(answer);
                answer = abs;
            } else {
                answer = notMaxCounter * moreNumber;
            }
        }

        // 모두다 같은 값 일 경우
        if (max == 1){
            for (int i = 0; i < arrList.size(); i++){
                if (answer != 0 && answer > arrList.get(i)){
                    answer = arrList.get(i);
                }
                if (answer == 0){
                    answer = arrList.get(i);
                }
            }
        }

        System.out.println(answer);

        return answer;
    }
}