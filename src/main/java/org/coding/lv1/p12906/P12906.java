package org.coding.lv1.p12906;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12906 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        new Solution().solution(arr);
    }
}

class Solution{
    public int[] solution(int []arr) {
        List<Integer> arrList = new ArrayList<>();
        /**
         * 방법 1
         */
        // 첫번째 나오는 인덱스는 무조건 중복이 안되기 때문에 일단 추가
        arrList.add(arr[0]);
        System.out.println(arr[6]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1])
                arrList.add(arr[i]);
        }

        /**
         * 방법 2 (내가 사용한 방법)
         */
//        for (int i = 1; i < arr.length; i++) {
//            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
//                arrList.add(arr[i]);
//            }
//        }

        System.out.println(arrList);

        int[] answer = new int[arrList.size()];

        for (int i = 0; i < arrList.size(); i++){
            answer[i] += arrList.get(i);
        }


        return answer;
    }
}