package org.coding.lv1.p42889;

import java.util.*;

public class P42889 {
    public static void main(String[] args) {
//        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] stages = {1, 1, 1, 2, 3, 4};
//        int[] stages = {1, 1, 1, 1, 1};
//        int[] stages = {1, 1, 1, 1};
        new Solution().solution(5, stages);
    }
}
class Solution {
    public int[] solution(int n, int[] stages) {
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            maps.put(i, 0);
        }

        for (int stage : stages) {
            if (stage <= n) {
                maps.put(stage, maps.getOrDefault(stage, 0) + 1);
            }
        }

        int people = stages.length;
        double[][] arr = new double[n][2];

        for (int i = 1; i <= n; i++) {
            int num = maps.get(i);
            double rate = people == 0 ? 0 : (double) num / people;
            arr[i - 1][0] = i;
            arr[i - 1][1] = rate;
            people -= num;
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o2[1] > o1[1]) {
                return 1;
            } else if (o2[1] < o1[1]) {
                return -1;
            } else {
                return (int) o1[0] - (int) o2[0];
            }
        });

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (int) arr[i][0];
        }

        return answer;
    }
}

// 내가 풀이한 코드 -> 틀림 -> gpt 이용해서 double 배열로 수정
//class Solution {
//    public int[] solution(int n, int[] stages) {
//        Map<Integer, Integer> maps = new HashMap<>();
//
//        for(int i = 1; i <= n; i++){
//            maps.put(i, 0);
//        }
//
//        int people = stages.length;
//        for (int stage : stages) {
//            maps.put(stage, maps.getOrDefault(stage, 0) + 1);
//        }
//
//        int[][] arr = new int[n][2]; // 스테이즈, 실패율
//        for (int i = 1; i <= n; i ++){
//            int num = maps.get(i);
//            double rate = (double) num / people;
//            people -= num;
//
//            arr[i - 1][0] = i;
//            arr[i - 1][1] = (int) (rate * 1000000000);
//        }
//
//        Arrays.sort(arr, (o1, o2) -> {
//            if (o1[1] == o2[1]){
//                return o1[0] - o2[0];
//            } else {
//                return o2[1] - o1[1];
//            }
//        });
//
//        int[] answer = new int[n];
//
//        for (int i = 0; i < answer.length; i++){
//            answer[i] = arr[i][0];
//        }
//
//        return answer;
//    }
//}