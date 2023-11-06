package org.coding.backJoon.silver.p10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        int[] arr1 = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        solution2(n, arr1, m, arr2);
    }

    private static void solution(int n, int[] arr1, int m, int[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++){
            map.put(arr2[i], 0);
        }

        for (int num : arr1){
            if (map.containsKey(num)){
                map.put(num, 1);
            }
        }

        for (int num : arr2){
            System.out.print(map.get(num) + " ");
        }

    }

    /**
     * 이분 탐색
     */
    private static void solution2(int n, int[] arr1, int m, int[] arr2) {
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr2.length; i++){
            int answer = binarySearch(arr1, n, arr2[i]);
            sb.append(answer).append(" ");
        }

        System.out.println(sb.toString());
    }

    private static int binarySearch(int[] arr1, int n, int search) {
        // 10 9 -5 2 3 4 5 -10
        int first = 0;
        int last = n - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2; // 중간 인덱스

            if (arr1[mid] == search) { // 중간값과 찾으려는 수가 같은 경우
                return 1;
            }

            if (arr1[mid] < search) { // 중간값이 찾으려는 수보다 작으면, 그 이하로는 볼 필요 없음.
                first = mid + 1;
            } else { // 중간값이 찾으려는 수보다 크면, 그 이상으로는 볼 필요 없음.
                last = mid - 1;
            }
        }

        return 0;
    }

}
