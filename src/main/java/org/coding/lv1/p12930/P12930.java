package org.coding.lv1.p12930;

public class P12930 {
    public static void main(String[] args) {
        new Solution().solution("try hello world");
//        new Solution().solution("  abc   abcd   abc d  ");
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";

        // 마지막에 공백이 있을 경우 통과되지 않기에 -1을 준다.
        String[] split = s.split(" ", -1);

        for (int i = 0; i < split.length; i++){
            // split으로 나눠진 인덱스를 chars에 넣어준다.
            char[] chars = split[i].toCharArray();

            // 대소문자 변환
            for (int j = 0; j < chars.length; j++) {
                if (j % 2 == 0) {
                    chars[j] = Character.toUpperCase(chars[j]);
                } else {
                    chars[j] = Character.toLowerCase(chars[j]);
                }
            }

            // i가 1일 떄부터 공백을 추가해준다.
            if (i > 0) {
                answer += " ";
            }

            System.out.println(chars);
            answer += new String(chars);
        }

        System.out.println(answer);
        return answer;
    }
}