package org.coding.backJoon.gold.p17609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P17609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            String str = br.readLine();
            solution(str);
        }
    }

    private static void solution(String str) {
        int start = 0;
        int end = str.length() - 1;
        int count = 0;


        while (start <= end){
            if (str.charAt(start) != str.charAt(end)) {
                if (isPalindrome(str, start + 1, end)) {
                    start++;
                    count++;
                } else if (isPalindrome(str, start, end - 1)) {
                    end--;
                    count++;
                } else {
                    count += 2;
                    break;
                }
            } else {
                start++;
                end--;
            }

        }

        System.out.println(count);

    }

    private static boolean isPalindrome(String str, int start, int end) {
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
