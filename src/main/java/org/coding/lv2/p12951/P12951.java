package org.coding.lv2.p12951;

import java.util.Arrays;

public class P12951 {
    public static void main(String[] args) {
//        new Solution().solution("3people unFollowed me");
        new Solution().solution("HI myName is  wish");
//        new Solution().solution("HI    myName is      wish   ");
    }
}


/**
 * 제이든 케이스 만들기!
 * 너무 복잡하게 코드를 구현한거 같다.
 */
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        // -1을 넣어주면 뒤에 공백을 다 받을 수 있다.
        String[] split = s.split(" ", -1);

        System.out.println(Arrays.toString(split));

        for(int i = 0; i < split.length; i++){
            String str = split[i];
            if (str.isBlank()){
                sb.append(" ");
                continue;
            }
            if(str.charAt(0) >= 97 && str.charAt(0) <= 122 || str.charAt(0) >= 65 && str.charAt(0) <= 90){
                for(int j = 0; j < str.length(); j++){
                    if(j == 0){
                        char c = Character.toUpperCase(str.charAt(j));
                        sb.append(Character.toUpperCase(c));
                    } else {
                        char c = str.charAt(j);
                        sb.append(Character.toLowerCase(c));
                    }
                }
            } else {
                sb.append(str.toLowerCase());
            }

            sb.append(" ");
        }

        for (int i = 0; i < sb.length() - 1; i++){
           answer.append(sb.charAt(i));
        }

        return answer.toString();
    }
}

/**
 * 첫 문자는 boolean이 true라 첫문자는 대문자.
 * 두번째부터는 빈문자열이 나오지 않으면 flag에 false 값을 넣어줘서 소문자로 넣어줌
 */
//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        String[] sp = s.toLowerCase().split("");
//        System.out.println(Arrays.toString(sp));
//        boolean flag = true;
//
//        for(String ss : sp) {
//            answer += flag ? ss.toUpperCase() : ss;
//            flag = ss.equals(" ") ? true : false;
//        }
//
//        return answer;
//    }
//}