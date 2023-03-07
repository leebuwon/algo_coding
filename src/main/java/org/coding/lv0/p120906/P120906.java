package org.coding.lv0.p120906;

public class P120906 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            answer += Character.getNumericValue(c);

        }
        return answer;

//        return (n + "") // 123 =? "123"
//                .chars() // "123" => intStream[49, 50, 51]
//                .map(e -> Character.getNumericValue(e)) // intStream[49, 50, 51] => intStream[1, 2, 3]
//                .map(Character::getNumericValue) // 스트림 형식
//                .sum(); // 6
    }
}