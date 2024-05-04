package org.coding.backJoon.silver.p28432;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P28432 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }

        int m = Integer.parseInt(br.readLine());
        String[] keyword = new String[m];
        for (int i = 0; i < keyword.length; i++) {
            keyword[i] = br.readLine();
        }

        solution(str, keyword);
    }

    private static void solution(String[] str, String[] keyword) {
        String answer = "";

        List<String> arrList = new ArrayList<>(Arrays.asList(str));

        if (arrList.size() == 1){
            answer = keyword[0];
            System.out.println(answer);
            return;
        }

        int index = 0;
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i).equals("?")) {
                index = i;
                break;
            }
        }

        if (index == 0) { // 처음 "?"가 등장하였을 경우
            char firstStr = arrList.get(index + 1).charAt(0);
            for (String s : keyword) {
                if (s.charAt(s.length() - 1) == firstStr) {
                    if (duplicate(s, arrList)) continue;
                    answer = s;
                    break;
                }
            }
        } else if (index == arrList.size() - 1) { // 마지막에 "?"가 등장하였을 경우
            char lastStr = arrList.get(index - 1).charAt(arrList.get(index - 1).length() - 1);
            for (String s : keyword) {
                if (s.charAt(0) == lastStr) {
                    if (duplicate(s, arrList)) continue;
                    answer = s;
                    break;
                }
            }
        } else {
            char lastStr = arrList.get(index - 1).charAt(arrList.get(index - 1).length() - 1);
            char firstStr = arrList.get(index + 1).charAt(0);

            for (String s : keyword) {
                if (s.charAt(0) == lastStr && s.charAt(s.length() - 1) == firstStr) {
                    if (duplicate(s, arrList)) continue;
                    answer = s;
                    break;
                }
            }
        }

        System.out.println(answer);
    }

    private static boolean duplicate(String s, List<String> arrList) {
        return arrList.contains(s);
    }
}