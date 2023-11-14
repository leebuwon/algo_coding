package org.coding.backJoon.silver.p2346;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Pair{
    int order;
    int next;
    Pair(int order, int next){
        this.order = order;
        this.next = next;
    }
}

public class P2346 {

    // 3 2 1 -3 -1 -> 3 터짐 ( 1 )
    // 2 1 -3 -1 -> -3 터짐 ( 4 )
    // 2 1 -1 -> -1 터짐 ( 5 )
    // 2 1 -> 1 터짐 ( 3 )
    // 2 -> 2터짐 ( 2 )
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Pair> pairDeque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++){
            int next = Integer.parseInt(st.nextToken());
            pairDeque.add(new Pair(i, next));
        }

        while (!pairDeque.isEmpty()){
            sb.append(pairDeque.getFirst().order).append(" ");
            int next = pairDeque.poll().next;
            if (pairDeque.isEmpty()) break;

            if (next > 0){
                next -= 1;
                for (int i = 0; i < next; i++){
                    pairDeque.addLast(pairDeque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(next); i++){
                    pairDeque.addFirst(pairDeque.pollLast());
                }
            }

        }
        System.out.println(sb.toString());

//        solution(arr);
    }


    /**
     * 메모리 초과
     */
//    private static void solution(int[] arr) {
//        StringBuilder sb = new StringBuilder();
//        Queue<Integer> queue = new LinkedList<>();
//        Map<Integer, Integer> maps = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++){
//            maps.put(arr[i], i + 1);
//        }
//
//        for (int num : arr){
//            queue.add(num);
//        }
//
//        List<Integer> arrList = new ArrayList<>();
//        while (!queue.isEmpty()){
//            int num = queue.poll();
//            if (num > 0){
//                arrList.add(num);
//                if (!queue.isEmpty()){
//                    for (int i = 1; i < num; i++){
//                        queue.add(queue.poll());
//                    }
//                }
//            } else {
//                int absNum = Math.abs(num);
//                if (!queue.isEmpty()){
//                    for (int i = 0; i < absNum; i++) {
//                        queue.add(queue.poll());
//                    }
//                }
//                arrList.add(num);
//            }
//        }
//
//        for (int i = 0; i < maps.size(); i++){
//            if (maps.containsKey(arrList.get(i))){
//                sb.append(maps.get(arrList.get(i))).append(" ");
//            }
//        }
//
//        System.out.println(sb.toString());
//    }
}
