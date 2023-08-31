package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Inf4S01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(solution(n, str));
    }

    /**
     * 강사님 풀이
     * HashMap 사용
     */
    private static char solution(int n, String str) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1); //getOrDefault x라는 key가 있으면 가져오고 없으면 0을 리턴하는 것!
        }

        System.out.println(map.containsKey('A')); // containsKey는 true 또는 false를 리턴해준다.s
        System.out.println(map.size()); // key의 갯수를 말해준다.
        System.out.println(map.remove('A')); // 특정 키 값을 삭제한다.

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) { // 맵 탐색 keySet()
            // System.out.println(key + " " + map.get(key)); 키와 값을 출력
            if (map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }



        return answer;
    }


//    private static String solution(int n, String str) {
//        String answer = "";
//        String[] split = str.split("");
//        int[] arr = new int[5];
//
//        for (int i = 0; i < n; i++){
//            if (split[i].equals("A")){
//                arr[0]++;
//            } else if (split[i].equals("B")) {
//                arr[1]++;
//            } else if (split[i].equals("C")) {
//                arr[2]++;
//            } else if (split[i].equals("D")) {
//                arr[3]++;
//            } else if (split[i].equals("E")) {
//                arr[4]++;
//            }
//        }
//
//        List<Integer> arrList = new ArrayList<>();
//        for (int i = 0 ; i < arr.length; i++){
//            arrList.add(arr[i]);
//        }
//
//        Integer max = Collections.max(arrList);
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] == max){
//                if (i == 0){
//                    return "A";
//                } else if (i == 1) {
//                    return "B";
//                } else if (i == 2) {
//                    return "C";
//                } else if (i == 3) {
//                    return "D";
//                } else if (i == 4) {
//                    return "E";
//                }
//            }
//        }
//
//        return answer;
//    }
}
