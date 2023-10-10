package org.coding.backJoon.silver.p2751;

import java.io.*;

/**
 * 책 풀이 : 병합 정렬
 */
//public class P2751 {
//    public static int[] arr, temp;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//
//        arr = new int[n + 1];
//        temp = new int[n + 1];
//        for (int i = 1; i <= n; i++){
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
//        merge_sort(1, n);
//
//        for (int i = 1; i <= n; i++){
//            bw.write(arr[i] + "\n");
//        }
//
//        bw.flush();
//        bw.close();
//
//    }
//
//    private static void merge_sort(int s, int e) {
//        // 배열의 길이가 1보다 작을 경우
//        if (e - s < 1){
//            return;
//        }
//
//        int m = s + (e - s) / 2;
//        // e를 m으로 계속 바꿔주며 분할
//        merge_sort(s, m);
//        merge_sort(m + 1, e);
//        for (int i = s; i <= e; i++){
//            temp[i] = arr[i];
//        }
//        int k = s;
//        int index1 = s;
//        int index2 = m + 1;
//        // 두 그룹을 병합하는 로직
//        while (index1 <= m && index2 <= e){
//            if (temp[index1] > temp[index2]){
//                arr[k] = temp[index2];
//                k++;
//                index2++;
//            } else {
//                arr[k] = temp[index1];
//                k++;
//                index1++;
//            }
//        }
//        while (index1 <= m){
//            arr[k] = temp[index1];
//            k++;
//            index1++;
//        }
//        while (index2 <= e){
//            arr[k] = temp[index2];
//            k++;
//            index2++;
//        }
//    }
//}


/**
 * 병합 정렬 - 다른 풀이
 */
public class P2751 {
    static int N;
    static int[] sorted, resultArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(arr, 0, N - 1);

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

    }

    static void mergeSort(int arr[], int m, int n) {
        if (m < n) {
            int middle = (m + n) / 2;
            mergeSort(arr, m, middle);
            mergeSort(arr, middle + 1, n);
            merge(arr, m, middle, n);
        }
    }

    static void merge(int arr[], int m, int middle, int n) {
        int i = m;
        int j = middle + 1;
        int k = m;
        sorted = new int[N];

        // 작은 순서대로 배열에 삽입
        while(i <= middle && j <= n) {
            if (arr[i] <= arr[j]) {
                sorted[k] = arr[i];
                i++;
            }
            else {
                sorted[k] = arr[j];
                j++;
            }
            k++;
        }

        // 남은 데이터도 삽입
        if (i > middle) {
            for (int z = j; z <= n; z++) {
                sorted[k] = arr[z];
                k++;
            }
        }
        else {
            for (int z = i; z <= middle; z++) {
                sorted[k] = arr[z];
                k++;
            }
        }

        // 정렬된 배열을 삽입
        for (int z = m; z <= n; z++) {
            arr[z] = sorted[z];
        }
    }
}