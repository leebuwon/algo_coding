package org.coding.lv1.p12901;

public class P12901 {
    public static void main(String[] args) {
        new Solution().solution(5, 24);
    }
}

/**
 * 해결방법을 찾지 못해 풀이를 보고 이해했음
 */
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] last={31,29,31,30,31,30,31,31,30,31,30,31};

        int date=0;
        for(int i=0; i<a - 1; i++){
            date += last[i];
        }
        date += b - 1;

        answer = week[date % 7];
        return answer;
    }
}