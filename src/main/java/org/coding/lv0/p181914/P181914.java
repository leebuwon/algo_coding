package org.coding.lv0.p181914;

public class P181914 {
    public static void main(String[] args) {
        new Solution().solution("345");
    }
}

class Solution {
    public int solution(String number) {
        int[] nums = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            // getNumericValue 숫자형태의 char형을 int형으로 변환
            nums[i] = Character.getNumericValue(number.charAt(i));
        }

        int answer = 0;
        for (int num : nums){
            answer += num;
        }

        return answer % 9;
    }
}