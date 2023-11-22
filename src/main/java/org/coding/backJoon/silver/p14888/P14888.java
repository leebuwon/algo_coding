package org.coding.backJoon.silver.p14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 풀이 참조
 */
public class P14888 {
    static int[] calculate;
    static int[] arr;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        calculate = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < calculate.length; i++){
            calculate[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int num, int depth) {
        if (depth == arr.length){
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < calculate.length; i++){
            if (calculate[i] != 0){

                calculate[i]--; // 연산자가 2개일 경우 하나를 빼준다.

                if (i == 0){
                    dfs(num + arr[depth], depth + 1);
                } else if (i == 1){
                    dfs(num - arr[depth], depth + 1);
                } else if (i == 2){
                    dfs(num * arr[depth], depth + 1);
                } else if (i == 3){
                    dfs(num / arr[depth], depth + 1);
                }

                calculate[i]++; // 재귀 호출이 종료되면 다시 숫자를 원상복귀 해준다.
            }
        }
    }
}
