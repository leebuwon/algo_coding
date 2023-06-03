package org.coding.lv1.p12944;

public class P12944 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        new Solution().solution(arr);
    }
}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        answer /= arr.length;
        System.out.println(answer);

        return answer;
    }
}
