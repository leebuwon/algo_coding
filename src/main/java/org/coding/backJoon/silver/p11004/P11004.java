package org.coding.backJoon.silver.p11004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, k, arr);
    }

    /**
     * 책 퓔이 : 퀵 정렬
     */
    private static void solution(int n, int k, int[] arr) {
        int answer;

        int startIdx = 0;
        int endIdx = n - 1;
        quickSort(arr, startIdx, endIdx, k - 1);
        answer = arr[k - 1];

        System.out.println(answer);
    }

    private static void quickSort(int[] arr, int startIdx, int endIdx, int k) {
        if (startIdx < endIdx){
            int pivot = partition(arr, startIdx, endIdx);
            if (pivot == k){
                return;
            } else if (k < pivot){
                quickSort(arr, startIdx, pivot - 1, k);
            } else {
                quickSort(arr, pivot + 1, endIdx, k);
            }
        }
    }

    private static int partition(int[] arr, int startIdx, int endIdx) {
        if (startIdx + 1 == endIdx) {
            if (arr[startIdx] > arr[endIdx]) {
                swap(arr, startIdx, endIdx);
                return endIdx;
            }
        }
        int m = (startIdx + endIdx) / 2;
        swap(arr, startIdx, m);
        int pivot = arr[startIdx];
        int i = startIdx + 1;
        int j = endIdx;
        while (i <= j) {
            while (pivot < arr[j] && j > 0) {
                j--;
            }
            while (pivot > arr[i] && i < arr.length - 1) {
                i++;
            }
            if (i <= j) {
                swap(arr, i++, j--);
            }
        }
        arr[startIdx] = arr[j];
        arr[j] = pivot;
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    /**
     * 시간 초과
     */
//    private static void solution(int n, int m, int[] arr) {
//        int answer = 0;
//
//        List<Integer> arrList = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            arrList.add(arr[i]);
//        }
//
//        Collections.sort(arrList);
//
//        for (int i = 0; i < n; i++) {
//            if (i == m) {
//                answer += arrList.get(i - 1);
//            }
//        }
//
//        System.out.println(answer);
//    }
}
