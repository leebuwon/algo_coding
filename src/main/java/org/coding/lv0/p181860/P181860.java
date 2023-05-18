package org.coding.lv0.p181860;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181860 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        new Solution().solution(arr, flag);
    }
}

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0;i < flag.length;i++){
            if (flag[i] == true){
                int size = arr[i] * 2;
                for (int j = 0; j < size; j++){
                    list.add(arr[i]);
                }

            }else if (flag[i] == false){
                int size = arr[i];
                for (int j = 0; j < size; j++){
                    list.remove(list.size() - 1);
                }
            }
        }


        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

// Stack 풀이
//class Solution {
//    public int[] solution(int[] arr, boolean[] flag) {
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < flag.length; i++) {
//            if (flag[i]) {
//                for (int j = 0; j < arr[i] * 2; j++) stack.push(arr[i]);
//            } else {
//                for (int j = 0; j < arr[i]; j++) stack.pop();
//            }
//        }
//
//        return stack.stream().mapToInt(Integer::intValue).toArray();
//    }
//}
