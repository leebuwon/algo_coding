package org.coding.lv1.p42748;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P42748 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        new Solution().solution(arr, arr2);
    }
}


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++){
            int[] inArr = commands[i];
            int[] start = new int[commands[i].length];
            List<Integer> arrList = new ArrayList<>();

            for (int j = 0; j < inArr.length; j++){
                start[j] += inArr[j];
            }

            System.out.println(Arrays.toString(start));

            for (int j = start[0] - 1; j <= start[1] - 1; j++){
                arrList.add(array[j]);
                Collections.sort(arrList);
            }

            answer[i] += arrList.get(inArr[2] - 1);
        }

        return answer;
    }
}