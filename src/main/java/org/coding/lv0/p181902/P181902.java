package org.coding.lv0.p181902;

import java.util.HashMap;
import java.util.Map;

public class P181902 {
    public static void main(String[] args) {
        new Solution().solution("Programmers");
    }
}

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Map<String, Integer> maps = new HashMap<>();
        maps.put("A", 0);
        maps.put("B", 1);
        maps.put("C", 2);
        maps.put("D", 3);
        maps.put("E", 4);
        maps.put("F", 5);
        maps.put("G", 6);
        maps.put("H", 7);
        maps.put("I", 8);
        maps.put("J", 9);
        maps.put("K", 10);
        maps.put("L", 11);
        maps.put("M", 12);
        maps.put("N", 13);
        maps.put("O", 14);
        maps.put("P", 15);
        maps.put("Q", 16);
        maps.put("R", 17);
        maps.put("S", 18);
        maps.put("T", 19);
        maps.put("U", 20);
        maps.put("V", 21);
        maps.put("W", 22);
        maps.put("X", 23);
        maps.put("Y", 24);
        maps.put("Z", 25);
        maps.put("a", 26);
        maps.put("b", 27);
        maps.put("c", 28);
        maps.put("d", 29);
        maps.put("e", 30);
        maps.put("f", 31);
        maps.put("g", 32);
        maps.put("h", 33);
        maps.put("i", 34);
        maps.put("j", 35);
        maps.put("k", 36);
        maps.put("l", 37);
        maps.put("m", 38);
        maps.put("n", 39);
        maps.put("o", 40);
        maps.put("p", 41);
        maps.put("q", 42);
        maps.put("r", 43);
        maps.put("s", 44);
        maps.put("t", 45);
        maps.put("u", 46);
        maps.put("v", 47);
        maps.put("w", 48);
        maps.put("x", 49);
        maps.put("y", 50);
        maps.put("z", 51);


        String[] str = my_string.split("");
        for(String s : str){
            Integer num = maps.get(s);

            answer[num]++;
        }


        return answer;
    }
}