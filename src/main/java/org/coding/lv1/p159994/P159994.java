package org.coding.lv1.p159994;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P159994 {
    public static void main(String[] args) {
//        String[] card1 = {"i", "drink", "water", "wow"};
        String[] card1 = {"a", "b", "c"};
//        String[] card2 = {"want", "to"};
        String[] card2 = {"d", "e", "f"};
//        String[] goal = {"i", "want", "to", "drink", "water"};
        String[] goal = {"a", "d", "f"};
        new Solution().solution(card1, card2, goal);
    }
}


class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int index1 = 0;
        int index2 = 0;

        for (String key : goal){
            if (index1 < cards1.length && key.equals(cards1[index1])){
                index1++;
            } else if (index2 < cards2.length && key.equals(cards2[index2])){
                index2++;
            } else {
                answer = "No";
                System.out.println(answer);
                return answer;
            }
        }

        System.out.println(answer);

        return answer;
    }
}

/**
 *  Queue로 해결한 풀이 법
 */
//class Solution {
//    public String solution(String[] cards1, String[] cards2, String[] goal) {
//        String answer = "";
//
//        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
//        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));
//
//        for (String g : goal) {
//            if (g.equals(queue1.peek())) {
//                queue1.poll();
//                continue;
//            } else if (g.equals(queue2.peek())) {
//                queue2.poll();
//                continue;
//            }
//            return "No";
//        }
//
//        return "Yes";
//    }
//}