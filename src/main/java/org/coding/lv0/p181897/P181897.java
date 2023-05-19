package org.coding.lv0.p181897;

import java.util.ArrayList;
import java.util.List;

public class P181897 {
    public static void main(String[] args) {
        int[] slicer = {1, 5, 2};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        new Solution().solution(3, slicer, arr);
    }
}

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        System.out.println(num_list.length);

        if (n == 1){
            for (int i = 0; i <= slicer[1]; i++){
                list.add(num_list[i]);
            }
        } else if (n == 2){
            for (int i = slicer[0]; i < num_list.length; i++){
                list.add(num_list[i]);
            }
        } else if (n == 3){
            for (int i = slicer[0]; i <= slicer[1]; i++){
                list.add(num_list[i]);
            }
        } else if(n == 4){
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]){
                list.add(num_list[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        System.out.println(list);
        return answer;
    }
}