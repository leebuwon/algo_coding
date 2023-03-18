package org.coding.lv0.p120862;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120862 {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3 ,4, -5};
        new Solution().solution(arr);
    }
}

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        return num1 > num2 ? num1 : num2;
    }
}