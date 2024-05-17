package org.coding.lv2.p42839;

import java.util.ArrayList;
import java.util.List;

public class P42839 {
    public static void main(String[] args) {
        new Solution().solution("17");
    }
}

class Solution {
    static List<Integer> arr = new ArrayList<>();
    static boolean[] check = new boolean[7];
    public int solution(String numbers) {
        int answer = 0;

        for(int i=0; i<numbers.length(); i++){
            dfs(numbers,"",i+1);
        }

        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++){
            if (prime(arr.get(i))){
                answer++;
            }
        }

        return answer;
    }

    static void dfs(String str, String temp, int m) {
        if(temp.length() == m){
            int num = Integer.parseInt(temp);
            if(!arr.contains(num)){
                arr.add(num);
            }
        }

        for(int i=0; i<str.length(); i++){
            if(!check[i]){
                check[i] = true;
                temp += str.charAt(i);
                dfs(str, temp, m);
                check[i] = false;
                temp = temp.substring(0, temp.length()-1);
            }
        }
    }

    private boolean prime(int num) {
        if (num <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}