package org.coding.lv0.p120902;

public class P120902 {
    public static void main(String[] args) {
        new Solution().solution("3 + 4");
    }
}


class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.split(" ");
        int num = Integer.parseInt(split[0]);

        for (int i = 1; i < split.length; i++){
            if (split[i].equals("+")){
                num += Integer.parseInt(split[i + 1]);
            } else if (split[i].equals("-")) {
                num -= Integer.parseInt(split[i + 1]);
            }
        }
        answer = num;
        System.out.println(answer);
        return answer;
    }
}