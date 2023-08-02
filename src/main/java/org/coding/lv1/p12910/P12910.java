package org.coding.lv1.p12910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12910 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6};
        new Solution().solution(arr, 10);
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrayList = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % divisor == 0){
                arrayList.add(arr[i]);
            }
        }

        if (arrayList.size() < 1){
            arrayList.add(-1);
        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] += arrayList.get(i);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}