package org.coding.lv0.p120897;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120897 {
    public static void main(String[] args) {
        new Solution().solution(29);
    }
}

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}