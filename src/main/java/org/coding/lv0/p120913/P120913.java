package org.coding.lv0.p120913;

import java.util.ArrayList;
import java.util.List;

public class P120913 {
    public static void main(String[] args) {
        new Solution().solution("abc1Addfggg4556b", 6);
    }
}

class Solution {
    public String[] solution(String my_str, int n) {
        String[] split = my_str.split("");
        List<String> list = new ArrayList<>();
        String result = "";
        for (int i = 0; i < split.length; i++){
            result += split[i];
            if ((i + 1) % n == 0){
                list.add(result);
                result = "";
            }
        }
        if (!result.equals("")){
            list.add(result);
        }
        System.out.println(list);

        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}