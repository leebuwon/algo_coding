package org.coding.lv1.p12916;

public class P12916 {
    public static void main(String[] args) {
        new Solution().solution("pPoooyY");
    }
}

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int num1 = 0;
        int num2 = 0;

        String lowerString = s.toLowerCase();
        String[] split = lowerString.split("");

        for (int i = 0; i < split.length; i++){
            if (split[i].equals("p")){
                num1++;
            } else if (split[i].equals("y")){
                num2++;
            }
        }

        if (num1 == num2){
            answer = true;
        } else {
            answer = false;
        }

        System.out.println(answer);
        return answer;
    }
}