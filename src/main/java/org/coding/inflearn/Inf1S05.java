package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inf1S05 {
    public static String reverseAlphabets(String str) {
        StringBuilder alphabets = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { // 해당 문자가 알파벳인지 확인해주는 메서드
                alphabets.append(c);
            }
        }

        alphabets.reverse();

        int alphabetIndex = 0;
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(alphabets.charAt(alphabetIndex++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String reversed = reverseAlphabets(str);
        System.out.println(reversed);
    }
}

/*
public class Inf1S05 {
    public static void main(String[] args) {
        Inf1S05 m = new Inf1S05();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }

    public static String solution(String str) {
        String answer = "";

        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        // lt가 rt보다 작을때까지만 순회
        while(lt < rt) {
            if(!Character.isAlphabetic(s[lt])) lt++; // isAlphabetic 인지 확인하는 메서드 알파벳이면 True
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s);

        return answer;
    }
}
*/
