package org.coding.lv1.p12928;

import java.util.ArrayList;
import java.util.List;

public class P12928 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
            answer += arr[i];
        }
        return answer;
    }
}
