package org.coding.lv1.p118666;

import java.util.*;

public class P118666 {
    public static void main(String[] args) {
//        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
//        int[] choice = {5, 3, 2, 7, 5};
//        String[] survey = {"TR", "RT", "TR"};
//        int[] choice = {7, 1, 3};
        String[] survey = {"AN"};
        int[] choice = {7}; // RCJN
        new Solution().solution(survey, choice);
    }
}

/**
 * 해결
 */
class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();

        Map<String, Integer> maps = new HashMap<>();
        maps.put("R", 0);
        maps.put("T", 0);
        maps.put("C", 0);
        maps.put("F", 0);
        maps.put("J", 0);
        maps.put("M", 0);
        maps.put("A", 0);
        maps.put("N", 0);

        for(int i = 0; i < survey.length; i++){
            int score = score(choices[i]);
            String mbti = mbti(survey[i], choices[i]);

            if (maps.containsKey(mbti)){
                maps.replace(mbti, maps.get(mbti) + score);
            } else {
                maps.replace(mbti , score);
            }
        }

        if (maps.containsKey("T") || maps.containsKey("R")) {
            int tScore = maps.get("T");
            int rScore = maps.get("R");

            if (tScore > rScore) {
                answer.append("T");
            } else if (rScore > tScore) {
                answer.append("R");
            } else {
                answer.append("R");
            }
        } else {
            if (maps.containsKey("T")) {
                answer.append("T");
            } else if (maps.containsKey("R")) {
                answer.append("R");
            }
        }

        if (maps.containsKey("C") || maps.containsKey("F")) {
            int tScore = maps.get("C");
            int rScore = maps.get("F");

            if (tScore > rScore) {
                answer.append("C");
            } else if (rScore > tScore) {
                answer.append("F");
            } else {
                answer.append("C");
            }
        } else {
            if (maps.containsKey("C")) {
                answer.append("C");
            } else if (maps.containsKey("F")) {
                answer.append("F");
            }
        }

        if (maps.containsKey("J") || maps.containsKey("M")) {
            int tScore = maps.get("J");
            int rScore = maps.get("M");

            if (tScore > rScore) {
                answer.append("J");
            } else if (rScore > tScore) {
                answer.append("M");
            } else {
                answer.append("J");
            }
        } else {
            if (maps.containsKey("J")) {
                answer.append("J");
            } else if (maps.containsKey("M")) {
                answer.append("M");
            }
        }

        if (maps.containsKey("A") || maps.containsKey("N")) {
            int tScore = maps.get("A");
            int rScore = maps.get("N");

            if (tScore > rScore) {
                answer.append("A");
            } else if (rScore > tScore) {
                answer.append("N");
            } else {
                answer.append("A");
            }
        } else {
            if (maps.containsKey("A")) {
                answer.append("A");
            } else if (maps.containsKey("N")) {
                answer.append("N");
            }
        }

        System.out.println(answer);

        return answer.toString();
    }

    private String mbti(String mbti, int choice) {
        String[] split = mbti.split("");
        if (choice < 4){
            return split[0];
        } else if (choice > 4) {
            return split[1];
        } else {
            return "nothing";
        }
    }

    private int score(int choice) {
        if (choice == 1 || choice == 7){
            return 3;
        } else if (choice == 2 || choice == 6) {
            return 2;
        } else if (choice == 3 || choice == 5){
            return 1;
        } else {
            return 0;
        }
    }
}

/**
 * 같은 Map 풀이법
 */
//class Solution {
//    public String solution(String[] survey, int[] choices) {
//        String answer = "";
//        char [][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
//        int [] score = {0, 3, 2, 1, 0, 1, 2, 3};
//        HashMap<Character, Integer> point = new HashMap<Character, Integer>();
//
//        // 점수 기록할 배열 초기화
//        for (char[] t : type) {
//            point.put(t[0], 0);
//            point.put(t[1], 0);
//        }
//
//        // 점수 기록
//        for (int idx = 0; idx < choices.length; idx++){
//            if(choices[idx] > 4){
//                point.put(survey[idx].charAt(1), point.get(survey[idx].charAt(1)) + score[choices[idx]]);
//            } else {
//                point.put(survey[idx].charAt(0), point.get(survey[idx].charAt(0)) + score[choices[idx]]);
//            }
//        }
//
//        // 지표 별 점수 비교 후 유형 기입
//        for (char[] t : type) {
//            answer += (point.get(t[1]) <= point.get(t[0])) ? t[0] : t[1];
//        }
//
//        return answer;
//    }
//}