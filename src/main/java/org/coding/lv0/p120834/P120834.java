package org.coding.lv0.p120834;

public class P120834 {
    public static void main(String[] args) {
        new Solution().solution(23);
    }
}

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        // int를 String으로 바꿀 수 있는 2가지 방법
//        String str = String.valueOf(age);
        String str = Integer.toString(age);

        for (int i = 0; i < str.length(); i++){
            // chatAt은 문자열 중에서 한 글자만 선택해 char 타입으로 변환
            // Character.getNumericValue는 char를 int로 캐스팅한다.
            int digit = Character.getNumericValue(str.charAt(i));
            System.out.print(digit);
            char alphabet = (char) (digit + 97);
            System.out.println(" " + alphabet);
            sb.append(alphabet);
        }
        System.out.println(sb);
        return sb.toString();
    }
}