package org.coding.backJoon.gold.p1253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[] arr) {
        int answer = 0;

        int startIdx = 0;
        int endIdx = arr.length - 1;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++){
            int current = arr[i];

            while (startIdx < endIdx){
                if (startIdx == i){
                    startIdx++;
                    continue;
                }

                if (endIdx == i){
                    endIdx--;
                    continue;
                }

                if (arr[startIdx] + arr[endIdx] == current){
                    answer++;
                    break;
                } else if (arr[startIdx] + arr[endIdx] > current){
                    endIdx--;
                } else {
                    startIdx++;
                }
            }

            startIdx = 0;
            endIdx = arr.length - 1;
        }


        return answer;
    }
}
