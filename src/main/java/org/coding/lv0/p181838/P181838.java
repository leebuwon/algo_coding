package org.coding.lv0.p181838;

public class P181838 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int[] date1, int[] date2) {
        int data1Year = date1[0];
        int data1Month = date1[1];
        int data1Day = date1[2];

        int data2Year = date2[0];
        int data2Month = date2[1];
        int data2Day = date2[2];

        if (data1Year < data2Year) {
            return 1;
        } else if (data1Year > data2Year) {
            return 0;
        } else {
            if (data1Month < data2Month) {
                return 1;
            } else if (data1Month > data2Month) {
                return 0;
            } else {
                if (data1Day < data2Day) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}