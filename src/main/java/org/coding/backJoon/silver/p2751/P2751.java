package org.coding.backJoon.silver.p2751;

import java.io.*;

/**
 * 책 풀이 : 병합 정렬
 */
public class P2751 {
    public static int[] arr, temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n + 1];
        temp = new int[n + 1];
        for (int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        merge_sort(1, n);

        for (int i = 1; i <= n; i++){
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();

    }

    private static void merge_sort(int s, int e) {
        // 배열의 길이가 1보다 작을 경우
        if (e - s < 1){
            return;
        }

        int m = s + (e - s) / 2;
        // e를 m으로 계속 바꿔주며 분할
        merge_sort(s, m);
        merge_sort(m + 1, e);
        for (int i = s; i <= e; i++){
            temp[i] = arr[i];
        }
        int k = s;
        int index1 = s;
        int index2 = m + 1;
        // 두 그룹을 병합하는 로직
        while (index1 <= m && index2 <= e){
            if (temp[index1] > temp[index2]){
                arr[k] = temp[index2];
                k++;
                index2++;
            } else {
                arr[k] = temp[index1];
                k++;
                index1++;
            }
        }
        while (index1 <= m){
            arr[k] = temp[index1];
            k++;
            index1++;
        }
        while (index2 <= e){
            arr[k] = temp[index2];
            k++;
            index2++;
        }
    }
}
