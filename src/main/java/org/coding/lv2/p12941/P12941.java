package org.coding.lv2.p12941;

import java.util.Arrays;

public class P12941 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2};
        int[] arr2 = {5, 4, 4};
        new Solution().solution(arr, arr2);
    }
}

class Solution {
    static int[] sorted;

    public int solution(int[] A, int[] B) {
        int answer = 0;

        mergeSort(A, 0, A.length - 1, true);
        mergeSort(B, 0, B.length - 1, false);

        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[i];
        }

        System.out.println(answer);
        return answer;
    }

    private void mergeSort(int[] arr, int m, int n, boolean flag) {
        if (m < n) {
            int middle = (m + n) / 2;
            mergeSort(arr, m, middle, flag);
            mergeSort(arr, middle + 1, n, flag);


            if (flag) {
                merge(arr, m, middle, n);
            } else {
                reverseMerge(arr, m, middle, n);
            }
        }
    }

    private void merge(int[] arr, int m, int middle, int n) {
        int i = m;
        int j = middle + 1;
        int k = m;
        // arr과 똑같은 배열의 크기를 가져야 하는데 -1해줘서 여태까지 터진거였다.
        sorted = new int[arr.length];

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

    private void reverseMerge(int[] arr, int m, int middle, int n) {
        int i = m;
        int j = middle + 1;
        int k = m;
        int[] reverseSorted = new int[arr.length];

        // 큰 순서대로 배열에 삽입
        while (i <= middle && j <= n) {
            if (arr[i] >= arr[j]) {
                reverseSorted[k] = arr[i];
                i++;
            } else {
                reverseSorted[k] = arr[j];
                j++;
            }
            k++;
        }

        // 남은 데이터도 삽입
        while (i <= middle) {
            reverseSorted[k] = arr[i];
            i++;
            k++;
        }

        while (j <= n) {
            reverseSorted[k] = arr[j];
            j++;
            k++;
        }

        // 정렬된 배열을 삽입
        for (int z = m; z <= n; z++) {
            arr[z] = reverseSorted[z];
        }
    }
}

/**
 * 다른 사람 풀이
 */
//class Solution {
//    public int solution(int []A, int []B) {
//        Arrays.sort(A);
//        Arrays.sort(B);
//
//        int length = A.length;
//        int answer = 0;
//
//        for (int i = 0; i < length; i++) {
//            answer += A[i] * B[length - 1 - i];
//        }
//
//        return answer;
//    }
//}



//class Solution {
//    public int solution(int []A, int []B){
//        int answer = 0;
//
//        Arrays.sort(A);
//
//        Integer[] reverseB = Arrays.stream(B).boxed().toArray(Integer[]::new);
//        Arrays.sort(reverseB, Comparator.reverseOrder());
//
//
//
//        int sum = 0;
//        for(int i = 0; i < A.length; i++){
//            sum += A[i] * reverseB[i];
//        }
//
//        answer = sum;
//        System.out.println(answer);
//
//        return answer;
//    }
//}