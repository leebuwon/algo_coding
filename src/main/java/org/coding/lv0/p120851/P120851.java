package org.coding.lv0.p120851;

public class P120851 {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(String my_string) {
        String answer = my_string.replaceAll("[^0-9]", ""); // aAb1B2cC34oOp
        return (answer)
                .chars()
                .map(e -> Character.getNumericValue(e))
//                .map(Character::getNumericValue) // 스트림 형식
                .sum();// 6
    }
}