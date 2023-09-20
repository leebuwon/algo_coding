package org.coding.lv1.p72410;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class P72410 {
    public static void main(String[] args) {
//        new Solution().solution("...!@BaT#*..y.abcdefghijklm");
//        new Solution().solution("z-+.^.");
        new Solution().solution("=.=");
//        new Solution().solution("123_.def");
//        new Solution().solution("abcdefghijklmn.p");
//        new Solution().solution(".sfgsgsg.");
//        new Solution().solution("b");
//        new Solution().solution(".bb.");
    }
}


class Solution {
    public String solution(String new_id) {
        StringBuilder answer = new StringBuilder();
        // 정규식으로 LowerCase로 바꾸는 방법
        // String s = new_id.replaceAll("[A-Z]", "$0").toLowerCase();
        String lowerCase = new_id.toLowerCase();
        String filterString = lowerCase.replaceAll("[^A-Za-z0-9._\\s-]", "");

        List<String> stringList = new ArrayList<>();
        char prevChar = ' ';
        for (int i = 0; i < filterString.length(); i++){
            char c = filterString.charAt(i);
            if (String.valueOf(c).equals(".") && String.valueOf(prevChar).equals(".")) {
                continue;
            }
            stringList.add(String.valueOf(c));
            prevChar = c;
        }

        if(stringList.get(0).equals(".")){
            stringList.remove(0);
        }

        if (stringList.isEmpty()){
            for (int i = 0; i < 3; i++){
                stringList.add("a");
            }
        }

        if (stringList.get(stringList.size() - 1).equals(".")){
            stringList.remove(stringList.size() - 1);
        }

        if (stringList.size() < 3 && !stringList.isEmpty()){
            for (int i = stringList.size(); i < 3; i++){
                stringList.add(stringList.get(stringList.size() - 1));
            }
        }

        if (stringList.size() >= 15) {
            stringList.subList(15, stringList.size()).clear();
        }

        if(stringList.get(0).equals(".")){
            stringList.remove(0);
        }

        if (stringList.get(stringList.size() - 1).equals(".")){
            stringList.remove(stringList.size() - 1);
        }

        for (int i = 0; i < stringList.size(); i++){
            answer.append(stringList.get(i));
        }



        System.out.println(answer);
        return answer.toString();
    }
}