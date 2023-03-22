package org.coding.lv0.p120905;

import java.util.ArrayList;
import java.util.List;

public class P120905 {
    public static void main(String[] args) {
        int[] numList = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        new Solution().solution(3, numList);
    }
}

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< numlist.length; i++){
            if (numlist[i] % n == 0){
                list.add(numlist[i]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}