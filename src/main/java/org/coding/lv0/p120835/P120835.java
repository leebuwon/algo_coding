package org.coding.lv0.p120835;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P120835 {
    public static void main(String[] args) {
        int[] arr = {3, 76, 24};
        new Solution().solution(arr);
    }
}

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> emergencyList = new ArrayList<>();
        for (int i = 0; i < emergency.length; i++){
            emergencyList.add(emergency[i]);
        }
        System.out.println(emergencyList);

        Collections.sort(emergencyList);
        System.out.println(emergencyList);

        for (int i = 0; i < emergency.length; i++) {
            int index = emergencyList.lastIndexOf(emergency[i]);
            answer[i] = emergencyList.size() - index;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}