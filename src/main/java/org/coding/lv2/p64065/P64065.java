package org.coding.lv2.p64065;

import java.util.*;

public class P64065 {
    public static void main(String[] args) {
        new Solution().solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
        new Solution().solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
    }
}

class Solution {
    public int[] solution(String s) {
        List<Integer> arrList = new ArrayList<>();
        s = s.substring(2);
        s = s.substring(0, s.length() - 2).replace("},{", "-");
        String[] str = s.split("-");

        Arrays.sort(str, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        for (String string : str) {
            String[] split = string.split(",");
            for (String unit : split) {
                if (!arrList.contains(Integer.parseInt(unit))){
                    arrList.add(Integer.parseInt(unit));
                }
            }
        }

        int[] answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}