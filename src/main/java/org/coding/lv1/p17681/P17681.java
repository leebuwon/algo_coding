package org.coding.lv1.p17681;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P17681 {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        new Solution().solution(5, arr1, arr2);
    }
}

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        List<String> arrList1 = new ArrayList<>();
        List<String> arrList2 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++){
            String binary1String = Integer.toBinaryString(arr1[i]);
            String binary2String = Integer.toBinaryString(arr2[i]);

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (int j = 0; j < n - binary1String.length(); j++){
                sb1.append('0');
            }

            for (int j = 0; j < n - binary2String.length(); j++){
                sb2.append('0');
            }

            String to1 = String.valueOf(sb1.append(binary1String));
            String to2 = String.valueOf(sb2.append(binary2String));
            to1 = to1.replace('1', '#').replace('0', ' ');
            to2 = to2.replace('1', '#').replace('0', ' ');

            arrList1.add(to1);
            arrList2.add(to2);
        }

        String[] answer = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            String combinedRow = combineRows(arrList1.get(i), arrList2.get(i));
            answer[i] = combinedRow;
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    private String combineRows(String row1, String row2) {
        StringBuilder combinedRow = new StringBuilder();
        for (int i = 0; i < row1.length(); i++) {
            if (row1.charAt(i) == '#' || row2.charAt(i) == '#') {
                combinedRow.append('#');
            } else {
                combinedRow.append(' ');
            }
        }
        return combinedRow.toString();
    }
}