package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Inf3S01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, arr1, m, arr2);
    }

    /**
     * 투 포인터 풀이
     */
    private static void solution(int n, int[] arr1, int m, int[] arr2) {
        StringBuilder sb = new StringBuilder();

        int arr1Idx = 0;
        int arr2Idx = 0;

        while (arr1Idx < n && arr2Idx < m){
            if (arr1[arr1Idx] < arr2[arr2Idx]){
                sb.append(arr1[arr1Idx]).append(" ");
                arr1Idx++;
            } else {
                sb.append(arr2[arr2Idx]).append(" ");
                arr2Idx++;
            }
        }

        while (arr1Idx < n) {
            sb.append(arr1[arr1Idx]).append(" ");
            arr1Idx++;
        }

        while (arr2Idx < m) {
            sb.append(arr2[arr2Idx]).append(" ");
            arr2Idx++;
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb.toString());
    }

    /**
     * 내 풀이
     */
//    private static void solution(int n, int[] arr1, int m, int[] arr2) {
//        StringBuilder sb = new StringBuilder();
//        List<Integer> arrayList = new ArrayList<>();
//
//        for (int i = 0; i < n; i++){
//            arrayList.add(arr1[i]);
//        }
//
//        for (int i = 0; i < m; i++){
//            arrayList.add(arr2[i]);
//        }
//
//        Collections.sort(arrayList);
//
//        for (Integer value : arrayList) {
//            sb.append(value).append(" ");
//        }
//
//        // 마지막 공백 제거
//        sb.deleteCharAt(sb.length() - 1);
//
//        System.out.println(sb.toString());
//    }
}
