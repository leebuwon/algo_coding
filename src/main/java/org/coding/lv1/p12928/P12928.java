package org.coding.lv1.p12928;

import java.util.ArrayList;
import java.util.List;

public class P12928 {
    public static void main(String[] args) {
        new Solution().solution(5);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                list.add(i);
                answer += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(answer);
        return answer;
    }
}
