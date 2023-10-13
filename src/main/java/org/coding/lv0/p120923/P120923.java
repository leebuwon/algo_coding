package org.coding.lv0.p120923;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120923 {
    public static void main(String[] args) {
        new Solution().solution(3, 12);
        new Solution().solution(5, 15);
        new Solution().solution(4, 14);
        new Solution().solution(100, 999);
    }
}

/**
 * 풀이 찾아봄
 */
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        /**
         * 4 - 1 == 3
         * start = 3;
         * (total/num) : 평균값 계산
         * ((num - 1)/2) : 중앙 원소에서 몇 개의 원소를 뺴고 더할지 결정
         */
        int start = (total/num) - ((num - 1)/2);

        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

/**
 * 오답 풀이
 */
//class Solution {
//    public int[] solution(int num, int total) {
//        int[] answer = new int[num];
//
//        int sum = 0;
//        List<Integer> arrList = new ArrayList<>();
//        while(sum != total){
//            for(int i = 0; i < total; i++){
//                int count = 0;
//                for(int j = i; j < total; j++){
//                    count++;
//                    sum += j;
//                    arrList.add(j);
//                    if(count == num){
//                        break;
//                    }
//                }
//                if (sum == total){
//                    break;
//                } else {
//                    sum = 0;
//                    arrList.clear();
//                }
//            }
//        }
//
//        for (int i = 0; i < arrList.size(); i++){
//            answer[i] = arrList.get(i);
//        }
//
//        return answer;
//    }
//}