package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Inf5S06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int start = Integer.parseInt(input[0]);
        int remove = Integer.parseInt(input[1]);

        int solution = solution(start, remove);
        System.out.println(solution);
    }

    private static int solution(int start, int remove) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= start; i++){
            queue.add(i);
        }

        while (!queue.isEmpty()){
            for (int i = 1; i <remove; i++) {
                queue.add(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }


        System.out.println(answer);
        return answer;
    }
}
