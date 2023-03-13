package org.coding.lv0.p120893;

public class P120893 {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++){
            if (Character.isUpperCase(my_string.charAt(i))){
                answer += Character.toLowerCase(my_string.charAt(i));
            } else if (Character.isLowerCase(my_string.charAt(i))) {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}