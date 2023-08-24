package org.coding.lv1.p176963;

import java.util.*;

public class P176963 {
    public static void main(String[] args) {
        String[] names = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        new Solution().solution(names, yearning, photo);
    }
}

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++){
            for (int j = 0; j < photo[i].length; j++){
                for (int k = 0; k < name.length; k++){
                    if (photo[i][j].equals(name[k])){
                        answer[i] += yearning[k];
                    }
                }
            }
        }

        return answer;
    }
}