package org.coding.lv1.p134240;

import java.util.ArrayList;
import java.util.List;

public class P134240 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6};
        new Solution().solution(arr);
    }
}
class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<String> stringList = new ArrayList<>();

        for (int i = 1; i < food.length; i++){
            int sum = food[i] / 2;

            for (int j = 1; j <= sum; j++){
                stringList.add(Integer.toString(i));
            }
        }

        stringList.add("0");

        for (int i = food.length -1; i >= 1; i--){
            int sum = food[i] / 2;

            for (int j = sum; j >= 1; j--){
                stringList.add(Integer.toString(i));
            }
        }

        for (int i = 0; i < stringList.size(); i++){
            answer += stringList.get(i);
        }

        return answer;
    }
}