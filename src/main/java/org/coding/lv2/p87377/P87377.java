package org.coding.lv2.p87377;

public class P87377 {
    public static void main(String[] args) {

    }
}

class Solution {
    public String[] solution(int[][] line) {
        String[] answer = {};
        return answer;
    }

    public long[] intersection(int[] line1, int[] line2) {

        double A = line1[0];
        double B = line1[1];
        double C = line1[2];

        double D = line2[0];
        double E = line2[1];
        double F = line2[2];

        // 아래와 같은 경우 평행해서 교점이 없다.
        if (A * D - B * C == 0){
            return null;
        }

        double x = (B * F - E * D) / (A * D - B * C);
        double y = (E * C - A * F) / (A * D - B * C);

        // 문제에서 정수좌표만 구하라고 했다.
        if ( x != (long)x ) return null;
        if ( y != (long)y ) return null;

        return new long[]{(long) x, (long) y};
    }
}
