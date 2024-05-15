package org.coding.lv2.p131701;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P131701 {
    public static void main(String[] args) {
        int[] arr = {7, 9, 1, 1, 4};
        new Solution().solution(arr);
    }
}

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 1; i <= elements.length; i++){
            int sum = 0;

            if(i != elements.length){
                for(int j = 0; j < i; j++){
                    sum += elements[j];
                }

                set.add(sum);

                for(int j = 1; j < elements.length; j++){
                    sum = sum - elements[(j - 1) % elements.length] + elements[(j + i - 1) % elements.length];
                    set.add(sum);
                }
            }

            if(i == elements.length){
                for (int element : elements) {
                    sum += element;
                }
                set.add(sum);
            }
        }

        answer = set.size();

        return answer;
    }
}