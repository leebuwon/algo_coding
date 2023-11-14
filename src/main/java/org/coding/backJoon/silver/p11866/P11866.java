package org.coding.backJoon.silver.p11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11866 {
    public static void main(String[] args) throws IOException {
        // 1 2 3 4 5 6 7 -> 3
        // 4 5 6 7 1 2 -> 6
        // 7 1 2 4 5 -> 2
        // 4 5 7 1 -> 7
        // 1 4 5 -> 5
        // 1 4 -> 1
        // 4 -> 4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        solution(n, m);
    }

    private static void solution(int n, int m) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            queue.add(i + 1);
        }

        int count = 0;
        while (!queue.isEmpty()){
            count++;

            if (count == m){
                arrList.add(queue.poll());
                count = 0;
            } else {
                queue.add(queue.poll());
            }
        }

        System.out.print("<");
        for (int i = 0; i < arrList.size() - 1; i++){
            System.out.print(arrList.get(i) + ", ");
        }
        System.out.print(arrList.get(arrList.size() - 1) + ">");
    }
}
