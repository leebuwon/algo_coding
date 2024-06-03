package org.coding.lv0.p181890;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181890 {
    public static void main(String[] args) {
        String[] str = {"r", "u", "d", "d"};
        new Solution().solution(str);
    }
}


class Solution {
    public String[] solution(String[] str_list) {
        List<String> str = new ArrayList<>();
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                str.addAll(Arrays.asList(str_list).subList(0, i));
                break;
            }

            if(str_list[i].equals("r")){
                str.addAll(Arrays.asList(str_list).subList(i + 1, str_list.length));
                break;
            }
        }

        String[] answer = new String[str.size()];
        for(int i = 0; i < str.size(); i++){
            answer[i] = str.get(i);
        }

        return answer;
    }
}