package org.coding.lv2.p12913;

import java.util.*;

public class P12913 {
    public static void main(String[] args) {
        int[][] land = {{1,2,3,5}, {5,6,7,8}, {4,3,2,1}};
        new Solution().solution(land);
    }
}

// dp 풀이 (참고)
class Solution {
    int solution(int[][] land) {
        int answer = 0;
        for (int i = 1; i < land.length; i++){
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3])); // 1열
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3])); // 2열
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3])); // 3열
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2])); // 4열
        }

        answer = Arrays.stream(land)
                .flatMapToInt(Arrays::stream)
                .max().orElseThrow();

        return answer;
    }
}