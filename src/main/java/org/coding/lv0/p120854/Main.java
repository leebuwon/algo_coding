package org.coding.lv0.p120854;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] strList = {"We", "are", "the", "world!"};
        new Solution().solution(strList);

    }
}

class Solution{
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++ )
            answer[i] = strlist[i].length();

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
