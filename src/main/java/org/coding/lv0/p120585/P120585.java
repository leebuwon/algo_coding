package org.coding.lv0.p120585;

public class P120585 {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++){
            if (height < array[i]){
                answer++;
            }
        }
        return answer;
    }
}
