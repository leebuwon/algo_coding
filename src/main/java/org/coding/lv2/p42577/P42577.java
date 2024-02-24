package org.coding.lv2.p42577;

import java.util.*;

public class P42577 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        new Solution().solution(phone_book);
    }
}


class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>(Arrays.asList(phone_book));

        for (String phoneNumber : phone_book) {
            for (int i = 1; i < phoneNumber.length(); i++){
                if (set.contains(phoneNumber.substring(0, i))){
                    return false;
                }
            }
        }

        return true;
    }
}