package org.coding.backJoon.silver.p11286;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 책 풀이
 * 우선 순위 큐 풀이 방법 ( 우선순위 큐를 정렬하는 법 )
 */
public class P11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 정렬
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs == second_abs){
                return o1 > o2 ? 1 : -1; // 절대값이 같으면 음수 우선 정렬
            } else {
                return first_abs - second_abs; // 절대값을 기준으로 정렬
            }
        });

        for (int i = 0; i < n; i++){
            int request = Integer.parseInt(br.readLine());
            System.out.println("request : " +request);
            if (request == 0){
                if (queue.isEmpty()){
                    System.out.println("0");
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(request);
            }
        }
    }
}
