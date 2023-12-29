package org.coding.lv2.p60057;

public class P60057 {
    public static void main(String[] args) {
        new Solution().solution("aabbaccc");
        new Solution().solution("ababcdcdababcdcd");
        new Solution().solution("abcabcdede");
        new Solution().solution("abcabcabcabcdededededede");
        new Solution().solution("xababcdcdababcdcd");
    }
}

class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder sb = new StringBuilder();
            String preStr = s.substring(0, i);
            int count = 1;

            for (int j = i; j <= s.length(); j += i) {
                String current;
                if (j + i > s.length()) {
                    current = s.substring(j);
                } else {
                    current = s.substring(j, j + i);
                }

                if (preStr.equals(current)) {
                    count++;
                } else {
                    if (count > 1) {
                        sb.append(count);
                    }
                    sb.append(preStr);
                    preStr = current;
                    count = 1;
                }
            }
            if (count > 1) {
                sb.append(count);
            }
            sb.append(preStr);

            answer = Math.min(answer, sb.length());
        }

        System.out.println(answer);
        return answer;
    }
}