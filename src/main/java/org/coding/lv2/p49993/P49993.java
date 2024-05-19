package org.coding.lv2.p49993;

import java.util.*;

public class P49993 {
    public static void main(String[] args) {
        String[] str = {"BACDE", "CBADF", "AECB", "BDA"};
//        String[] str = {"CAD"};
        new Solution().solution("CBD", str);
    }
}

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        String[] order = skill.split("");

        Map<String, Integer> orderMap = new HashMap<>();
        for(int i = 0; i < order.length; i++){
            orderMap.put(order[i], i);
        }

        for (String skill_tree : skill_trees) {
            int skillIndex = -1;
            boolean isValid = true;

            for (int j = 0; j < skill_tree.length(); j++){
                char c = skill_tree.charAt(j);
                if (orderMap.containsKey(String.valueOf(c))){
                    int currentIndex = orderMap.get(String.valueOf(c));

                    if (currentIndex > skillIndex + 1){
                        isValid = false;
                        break;
                    }
                    skillIndex = currentIndex;
                }
            }

            if (isValid){
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }
}