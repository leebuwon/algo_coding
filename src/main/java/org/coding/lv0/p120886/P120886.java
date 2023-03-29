package org.coding.lv0.p120886;

import java.util.Arrays;

public class P120886 {
    public static void main(String[] args) {
        new Solution().solution("olleh", "hello");
        new Solution().solution("allpe", "apple");
    }
}

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();

        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);

        if ((Arrays.toString(beforeChar)).equals(Arrays.toString(afterChar))) {
            answer += 1;
        } else{
            return answer;
        }
        return answer;
    }
}

// 문제를 잘못이해했다.. 나는 reverse 했을 경우 나와야한다고 착각함.
//class Solution {
//    public int solution(String before, String after) {
//        int answer = 0;
//        StringBuilder sb = new StringBuilder(before);
//
//        String reverse = sb.reverse().toString();
//        System.out.println(reverse);
//
//        if (after.equals(reverse)){
//            answer += 1;
//        } else {
//            System.out.println(answer);
//           return answer;
//        }
//        System.out.println(answer);
//        return answer;
//    }
//}