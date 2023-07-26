package org.coding.lv1.p131705;

public class P131705 {
    public static void main(String[] args) {
        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        new Solution().solution(number);
    }
}

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i < number.length; i++){
            for (int j = i+1; j < number.length; j++){
                for (int c = j+1; c < number.length; c++){
                    if (number[i] + number[j] + number[c] == 0){
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
        return answer;
    }
}