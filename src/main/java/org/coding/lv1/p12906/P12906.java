package org.coding.lv1.p12906;

import java.util.ArrayList;
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
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                arrList.add(arr[i]);
            }
        }

        System.out.println(arrList);

        int[] answer = new int[arrList.size()];

        for (int i = 0; i < arrList.size(); i++){
            answer[i] += arrList.get(i);
        }


        return answer;
    }
}