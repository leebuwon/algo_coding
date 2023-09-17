package org.coding.lv1.p155652;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P155652 {
    public static void main(String[] args) {
//        new Solution().solution("aukks", "wbqd", 5);
//        new Solution().solution("zzzzz", "a", 1);
//        new Solution().solution("ybcde", "az", 1);
        new Solution().solution("z", "abcdefghij", 20);
    }
}

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        List<String> strings = new ArrayList<>();
        String[] split = skip.split("");

        for (int i = 'a'; i <= 'z'; i++){
            strings.add(String.valueOf((char) i));
        }

        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < skip.length(); j++) {
                if (strings.get(i).equals(split[j])) {
                    strings.remove(i);
                    i--;
                    break;
                }
            }
        }

        System.out.println(strings);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int currentIndex = strings.indexOf(String.valueOf(c));
            System.out.println(currentIndex);

            for (int j = 0; j < index; j++) {
                currentIndex++;
                if (currentIndex >= strings.size()) {
                    currentIndex = 0;
                }
            }

            answer.append(strings.get(currentIndex));
        }

        System.out.println(answer);

        return answer.toString();
    }
}

/**
 * 틀린 로직...
 */
//class Solution {
//    public String solution(String s, String skip, int index) {
//        StringBuilder answer = new StringBuilder();
//        String[] split = skip.split("");
//
//        List<String> strings = new ArrayList<>(List.of(split));
//        for (int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//
//            int count = 0;
//            for (int j = 0; j < index; j++){
//                if (strings.contains(String.valueOf(c))){
//                    count++;
//                }
//                c++;
//            }
//
//            c += count;
//
//            if (c > 122){
//                c = (char) (c - 122 + 96);
//            }
//
//            answer.append(c);
//        }
//
//        System.out.println(answer);
//
//        return answer.toString();
//    }
//}
