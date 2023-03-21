package org.coding.lv0.p120899;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120899 {
    public static void main(String[] args) {
        int[] arr = {9, 10, 15, 20, 24, 4, 299};
        new Solution().solution(arr);
    }
}

class Solution {
    public int[] solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int arrNumber = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }

        for (int i = 0; i < array.length; i++){
            if (array[i] == max){ // max는 가장 큰 수인 8이 들어가있음
                arrNumber += i; // max의 배열위치를 찾기위해 i를 더 해준다.
            }
        }

        list.add(max); // max = 8
        list.add(arrNumber);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}