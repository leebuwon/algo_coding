package org.coding.lv0.p181873;

public class P181873 {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";

        String[] split = my_string.split("");

        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            if (s.equals(alp)){
                sb.append(s.toUpperCase());
            } else {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}