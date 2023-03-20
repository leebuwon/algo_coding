package org.coding.lv0.p120895;

public class P120895 {
    public static void main(String[] args) {

    }
}

// 내가 해결하지 못하여 서칭하여 해결
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++){
            if (i == num1) {
                answer += my_string.charAt(num2) + "";
            } else if (i == num2) {
                answer += my_string.charAt(num1) + "";
            } else
                answer += my_string.charAt(i) + "";
        }
        return answer;
    }
}