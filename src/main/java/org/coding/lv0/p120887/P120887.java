package org.coding.lv0.p120887;

public class P120887 {
    public static void main(String[] args) {
        new Solution().solution(10, 50, 5);

    }
}

class Solution {
    public int solution(int startNumber, int endNumber, int k) {
        int answer = 0;
        String str = "";
        for (int i = startNumber; i <= endNumber; i++){
            str += Integer.toString(i);
        }
        for (int i = 0; i <str.length(); i++){
            if (str.charAt(i) == Integer.toString(k).charAt(0)){
                answer++;
            }
        }
        System.out.println(str);
        System.out.println(answer);
        return answer;
    }
}