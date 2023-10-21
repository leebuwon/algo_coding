package org.coding.lv2.p42885;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class P42885 {
    public static void main(String[] args) {
//        int[] arr = {70, 50, 80, 50};
        int[] arr = {70, 80, 50};
        new Solution().solution(arr, 100);
    }
}

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int startIdx = 0;
        int endIdx = people.length - 1;

        System.out.println(Arrays.toString(people));

        while (startIdx <= endIdx){
            // 무게가 60 이상일 경우
            if (people[startIdx] + people[endIdx] <= limit){
                startIdx++;
            }
            endIdx--;
            answer++;
        }

        return answer;
    }
}

/**
 * 실패 코드
 * 문제 이해를 잘못했음
 */
//class Solution {
//    public int solution(int[] people, int limit) {
//        int answer = 0;
//
//        List<Integer> arrList = new ArrayList<>();
//        for(int i = 0; i < people.length; i++){
//            if(people[i] <= 60){
//                arrList.add(people[i]);
//            } else if(people[i] <= 100 && people[i] > 60){
//                answer++;
//            }
//        }
//
//        Collections.sort(arrList);
//
//        int startIdx = 0;
//        int endIdx = arrList.size() - 1;
//
//        while(startIdx <= endIdx){
//            if(arrList.get(startIdx) + arrList.get(endIdx) <= 100){
//                answer++;
//                startIdx++;
//                endIdx--;
//            }
//        }
//
//        return answer;
//    }
//}


/**
 * 다른 사람 풀이
 */
//class Solution {
//    public int solution(int[] people, int limit) {
//        int answer = 0;
//
//        Arrays.sort(people);
//        // 기본값이 false로 세팅이된다.
//        boolean[] visited = new boolean[people.length];
//
//        int index = people.length - 1;
//        for (int i = 0; i < people.length; ++i) {
//            if (!visited[i]) {
//                int person = people[i];
//                visited[i] = true;
//                ++answer;
//
//                for (int j = index; j > i; --j) {
//                    if (!visited[j]) {
//                        int partner = people[j];
//                        if (partner + person <= limit) {
//                            visited[j] = true;
//                            index = j - 1;
//                            break;
//                        }
//                    }
//                    --index;
//                }
//            }
//        }
//
//        return answer;
//    }
//}