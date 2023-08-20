package org.coding.lv1.p68644;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P68644 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 1};
        new Solution().solution(arr);
    }
}


class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++){
            int temp = numbers[i];
            for (int j = 0; j < numbers.length; j++){
                if (i != j){
                    integerSet.add(temp + numbers[j]);
                }
            }
        }

        int[] answer = new int[integerSet.size()];
        Object[] objects = integerSet.toArray();
        for (int i = 0; i < objects.length; i++){
            answer[i] = (int) objects[i];
        }

        Arrays.sort(answer);

        return answer;
    }
}