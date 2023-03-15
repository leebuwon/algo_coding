package org.coding.lv0.p120850;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120850 {
    public static void main(String[] args) {
        new Solution().solution("ads8fs6df78adg");
    }
}
// 해결하지 못하여 코드 검색 후 해결
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

         char[] c = my_string.toCharArray();
         for (int i = 0; i< c.length; i++){
             if (c[i] >= 48 && c[i] <= 57){
                 list.add(c[i] - '0');
             }
         }

        answer = new int[list.size()];
         for (int i = 0; i < answer.length; i++){
             answer[i] = list.get(i);
         }
         Arrays.sort(answer);

         return answer;
    }
}

//class Solution {
//    public int[] solution(String my_string) {
//        return my_string
//                .chars()
//                .filter(Character::isDigit)
//                .map(Character::getNumericValue)
//                .sorted()
//                .toArray();
//    }
//}