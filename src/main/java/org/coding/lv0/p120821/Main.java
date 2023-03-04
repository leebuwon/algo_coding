package org.coding.lv0.p120821;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
}

class Solution{
    public int[] solution(int[] num_list) {
        // 더 좋은 reverse 방법 찾기
        int[] answer = new int[num_list.length];

        for (int i = 0; i < answer.length; i++){
            answer[i] = num_list[num_list.length - i - 1];
        }

        return answer;
    }
}

/**
 * 스트림으로 해결한 예제
 * 프로그래머스 0레벨
 */
//class Solution {
//    public int[] solution(int[] numList) {
//        List<Integer> list = Arrays.stream(numList)
//                .boxed()
//                .collect(Collectors.toList());
//
//        Collections.reverse(list);
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
//}