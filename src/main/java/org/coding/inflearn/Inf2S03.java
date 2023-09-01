package org.coding.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inf2S03 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++){
            b[i] = kb.nextInt();
        }

        System.out.println(solution(n, a, b));
//        System.out.println(Arrays.toString(solution(n, a, b)));
    }


    /**
     * 강사님 코드
     */
    private static String solution(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++){
            if (a[i] == b[i]) {
                answer += "D";
            } else if (a[i] == 1 && b[i] == 3) {
                answer += "A";
            } else if (a[i] == 2 && b[i] == 1) {
                answer += "A";
            } else if (a[i] == 3 && b[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }

        return answer;
    }


//    private static String[] solution(int n, int[] a, int[] b) {
//        String[] answer = new String[n];
//        List<String> strings = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            if (a[i] == b[i]){
//                strings.add("D");
//            } else if (a[i] == 1 && b[i] == 2){
//                strings.add("B");
//            } else if (a[i] == 1 && b[i] == 3){
//                strings.add("A");
//            } else if (a[i] == 2 && b[i] == 1){
//                strings.add("A");
//            } else if (a[i] == 2 && b[i] == 3){
//                strings.add("B");
//            } else if (a[i] == 3 && b[i] == 1){
//                strings.add("B");
//            } else if (a[i] == 3 && b[i] == 2){
//                strings.add("A");
//            }
//        }
//
//        for (int i = 0; i < strings.size(); i++){
//            answer[i] = strings.get(i);
//        }
//
//        return answer;
//    }
}
