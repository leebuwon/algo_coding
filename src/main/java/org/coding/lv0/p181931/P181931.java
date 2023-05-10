package org.coding.lv0.p181931;

public class P181931 {
    public static void main(String[] args) {
        boolean[] booleansArr = {true, false, false, true, true};
        new Solution().solution(3, 4, booleansArr);
    }
}

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        if (included[0] == true) {
            answer += a;
        }
        for (int i = 1; i < included.length; i++){
            if (included[i] == true){
                a += d;
                answer += a;
            } else if (included[i] == false){
                a += d;
            }
        }
        System.out.println(answer);
        return answer;
    }
}