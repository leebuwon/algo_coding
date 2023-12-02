package org.coding.backJoon.silver.p1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1920 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrN = new int[n];

        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arrM = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++){
            arrM[i] = Integer.parseInt(st.nextToken());
        }


        solution(arrN, arrM);
    }

    private static void solution(int[] arrN, int[] arrM) {
        Arrays.sort(arrN);

        for (int i = 0; i < arrM.length; i++){
            int nowValue = arrM[i];
            int num = binarySearch(0, arrN.length - 1, arrN, nowValue);
            sb.append(num).append("\n");
        }


        System.out.println(sb.toString());
    }

    private static int binarySearch(int left, int right,  int[] arrN, int nowValue) {
        if (left > right){
            return 0;
        }

        int middle = (left + right) / 2;

        if (arrN[middle] == nowValue){
            return 1;
        }

        if (arrN[middle] > nowValue){
            return binarySearch(left, middle - 1, arrN, nowValue);
        } else {
            return binarySearch(middle + 1, right, arrN, nowValue);
        }
    }
}
