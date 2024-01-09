package org.coding.backJoon.silver.p1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1697 {
    static boolean[] visited;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n  = Integer.parseInt(st.nextToken());
        int k  = Integer.parseInt(st.nextToken());

        visited = new boolean[100001];
        arr = new int[100001];

        solution(n, k);
    }

    private static void solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        visited[n] = true;

        while (!queue.isEmpty()){
            int num = queue.poll();

            if (num == k){
                System.out.println(arr[num]);
                return;
            }

            if (num - 1 >= 0 && !visited[num - 1]){
                queue.add(num - 1);
                visited[num - 1] = true;
                arr[num - 1] += arr[num] + 1;
            }

            if (num + 1 < 100001 && !visited[num + 1]){
                queue.add(num + 1);
                visited[num + 1] = true;
                arr[num + 1] = arr[num] + 1;
            }

            if (num * 2 < 100001 && !visited[num * 2]){
                queue.add(num * 2);
                visited[num * 2] = true;
                arr[num * 2] = arr[num] + 1;
            }
        }
    }
}
