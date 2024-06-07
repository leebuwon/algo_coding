package org.coding.lv0.p181880;

public class P181880 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        for(int i = 0; i < num_list.length; i++){
            int num = num_list[i];
            while(num != 1){
                if(num % 2 == 0){
                    num /= 2;
                    sum++;
                } else {
                    num = (num - 1) / 2;
                    sum++;
                }
            }
        }

        return sum;
    }
}