package org.coding.lv0.p120888;

public class P120888 {
    public static void main(String[] args) {
        new Solution().solution("We are the World");
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++){
            if (my_string.indexOf(my_string.charAt(i)) == i){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}