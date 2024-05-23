package org.coding.lv1.p250121;

import java.sql.SQLOutput;
import java.util.*;

public class P250121 {
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String exit = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        new Solution().solution(data, exit, val_ext, sort_by);
    }
}

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> arrList = new ArrayList<>();


        for (int[] datum : data) {
            if (ext.equals("code")) {
                if (datum[0] < val_ext) {
                    arrList.add(datum);
                }
            } else if (ext.equals("date")) {
                if (datum[1] < val_ext) {
                    arrList.add(datum);
                }
            } else if (ext.equals("maximum")) {
                if (datum[2] < val_ext) {
                    arrList.add(datum);
                }
            } else {
                if (datum[3] < val_ext) {
                    arrList.add(datum);
                }
            }
        }



        int[][] answer = new int[arrList.size()][4];

        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        if (sort_by.equals("code")){
            Arrays.sort(answer, (o1, o2) -> o1[0] - o2[0]);
        } else if (sort_by.equals("date")){
            Arrays.sort(answer, (o1, o2) -> o1[1] - o2[1]);
        } else if (sort_by.equals("maximum")){
            Arrays.sort(answer, (o1, o2) -> o1[2] - o2[2]);
        } else {
            Arrays.sort(answer, (o1, o2) -> o1[3] - o2[3]);
        }

        return answer;
    }
}