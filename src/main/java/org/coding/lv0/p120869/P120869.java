package org.coding.lv0.p120869;

import java.util.Arrays;

public class P120869 {
    public static void main(String[] args) {
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "loveaw", "dzx"};
        new Solution().solution(spell, dic);
    }
}
class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        System.out.println(Arrays.toString(spell));

        for (String word : dic) {
            String sortedWord = sortWord(word);
            System.out.println(sortedWord);
            if (sortedWord.equals(String.join("", spell))) {
                return 1;
            }
        }

        return 2;
    }

    private String sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}