package org.coding.backJoon.silver.p26215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 56프로 오류(해결 못함)
 */
public class P26215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (Integer num : arr) {
            pq.add(num);
        }

        int deadLine = 1440;
        int minute = 0;

        if (pq.size() == 1 && pq.peek() > deadLine) {
            System.out.println(-1);
            return;
        }

        while (pq.size() > 1){
            int max = pq.poll();
            int secondMax = pq.isEmpty() ? 0 : pq.poll();

            if (max == 0) {
                break;
            }

            max--;
            if (secondMax != 0){
                secondMax--;
            }
            minute++;

            pq.add(max);
            if (secondMax != 0){
                pq.add(secondMax);
            }

            if (minute > deadLine){
                System.out.println(-1);
                break;
            }
        }

        minute += pq.peek() != null ? pq.poll() : 0;

        System.out.println(minute);
    }
}