package org.coding.lv1.p12947;

public class P12947 {
    public static void main(String[] args) {
        new Solution().solution(10);
    }
}

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String str = String.valueOf(x);
        String[] split = str.split("");

        for (int i = 0; i < split.length; i++){
            sum += Integer.parseInt(split[i]);
        }

        if (x % sum == 0){
            answer = true;
        } else{
            answer = false;
        }

        return answer;
    }
}