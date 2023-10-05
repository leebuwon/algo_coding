package org.coding.backJoon.silver.p2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution(n);
    }

    private static void solution(int n) {


        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++){
            queue.add(i);
        }

        // 1 2 3 4 5 6 -> 2 3 4 5 6
        // 3 4 5 6 2
        // 4 5 6 2
        // 5 6 2 4
        // 6 2 4
        // 2 4 6
        // 4 6
        // 6 4
        // 4
        while (queue.size() > 1) {
            queue.remove();

            // 뒤에다 추가
            int front = queue.poll();
            queue.add(front);
        }
        int answer = queue.peek();
        System.out.println(answer);

    }
}
