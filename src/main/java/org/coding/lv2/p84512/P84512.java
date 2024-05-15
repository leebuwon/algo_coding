package org.coding.lv2.p84512;

public class P84512 {
    public static void main(String[] args) {
//        new Solution().solution("AAAAE");
        new Solution().solution("AAAAU");
//        new Solution().solution("AAAE");
//        new Solution().solution("I");
    }
}

class Solution {
    private static final int[] WEIGHT = {781, 156, 31, 6, 1}; // 가중치
    private static final char[] WORDS = {'A', 'E', 'I', 'O', 'U'};
    public int solution(String word) {
        int answer = 0;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            answer += getCharIndex(c) * WEIGHT[i] + 1;
        }

        return answer;
    }


    private static int getCharIndex(char c) {
        for (int i = 0; i < WORDS.length; i++) {
            if (WORDS[i] == c) {
                return i;
            }
        }
        return -1;
    }
}