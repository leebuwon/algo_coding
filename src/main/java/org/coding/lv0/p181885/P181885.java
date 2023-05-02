package org.coding.lv0.p181885;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181885 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        new Solution().solution(todo_list, finished);
    }
}

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++){
            if (finished[i] == false){
                list.add(todo_list[i]);
            }
        }
        System.out.println(list);

        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}