package org.coding.lv1.p42862;

import javax.accessibility.AccessibleRelation;
import java.util.Arrays;

public class P42862 {
    public static void main(String[] args) {
//        int[] lost = {2, 4};
//        int[] reverse = {1, 3, 5};
//        int[] lost = {3};
//        int[] reverse = {1};
        int[] lost = {3, 4, 7, 9};
        int[] reverse = {2, 3, 8}; // answer = 8;


        new Solution().solution(10, lost, reverse);
    }
}


class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = 100;
                    reserve[j] = -1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
                    lost[i] = 100;
                    reserve[j] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(lost));
        System.out.println(Arrays.toString(reserve));


        for (int i = 0; i < lost.length; i++){
            if (lost[i] == 100){
                sum++;
            }
        }

        answer = n - lost.length + sum;

        System.out.println(answer);

        return answer;
    }
}