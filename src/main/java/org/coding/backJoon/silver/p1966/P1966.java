package org.coding.backJoon.silver.p1966;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P1966 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < testNum; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            solution(n, m, arr);
        }

    }

    // 인덱스 번호를 어떻게 기억해줄 것이냐! map을 사용할까?
    private static void solution(int n, int m, int[] arr) {
        Queue<Map<Integer, Integer>> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++){
            Map<Integer, Integer> map = new HashMap<>();
            map.put(arr[i], i);
            queue.add(map);
            pq.add(arr[i]);
        }
        int count = 0;
        while (!queue.isEmpty()){
            Map<Integer, Integer> maps = queue.poll();
            int max = pq.peek();

            if (max == maps.keySet().iterator().next()){
                count++;
                if (m == maps.get(max)){
                    System.out.println(count);
                    break;
                }
                pq.poll();
            } else {
                queue.add(maps);
            }
        }
    }
}
