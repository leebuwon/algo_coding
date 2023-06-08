package org.coding.lv1.p12933;

import java.util.Arrays;
import java.util.Collections;

public class P12933 {
    public static void main(String[] args) {
        new Solution().solution(118372);
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] split = String.valueOf(n).split("");
        Arrays.sort(split);

        // 역순 정렬
        Collections.reverse(Arrays.asList(split));

        long[] arr = new long[split.length];
        for (int i = 0; i < split.length; i++){
            String s = split[i];
            arr[i] = Long.parseLong(s);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }

        answer = Long.parseLong(sb.toString());

        System.out.println(answer);
        return answer;
    }
}