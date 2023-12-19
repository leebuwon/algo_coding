package org.coding.backJoon.gold.p1806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1806 {
    static int n;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr, s);
    }

    // 투 포인터
    private static void solution2(int[] arr, int s) {
        int start = 0;
        int end = 0;
        int sum = arr[start];

        while (start < n && end < n){
            if (min == 1){
                break;
            }

            if (sum < s){
                end++;
                if (end < n){
                    sum += arr[end];
                } else {
                    break;
                }
            } else {
                min = Math.min(min, end - start + 1);

                sum -= arr[start];
                start++;
            }
        }

        System.out.println(min != Integer.MAX_VALUE ? min : 0);
    }

    // 슬라이딩 윈도우 (사실상 투 포인터)
    private static void solution(int[] arr, int s) {
        int start = 0;
        int sum = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum >= s) {
                // 길이 구하기
                min = Math.min(min, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        System.out.println(min != Integer.MAX_VALUE ? min : 0);
    }
}
