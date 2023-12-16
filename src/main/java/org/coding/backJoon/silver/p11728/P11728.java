package org.coding.backJoon.silver.p11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11728 {
    static int a;
    static int b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        int[] n = new int[a];
        int[] m = new int[b];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n.length; i++){
            n[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m.length; i++){
            m[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, m);
    }

    // 나의 풀이
    private static void solution(int[] n, int[] m) {
        List<Integer> arr = new ArrayList<>();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = 0; i < min; i++){
            arr.add(n[i]);
            arr.add(m[i]);
        }

        for (int i = min; i < max; i++){
            if (n.length == max){
                arr.add(n[i]);
            }

            if (m.length == max){
                arr.add(m[i]);
            }
        }

        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }

    // two pointer 풀이
    private static void twoPointerSolution(int[] n, int[] m) {
        int p1 = 0, p2=0;

        StringBuilder sb = new StringBuilder();

        while(p1<a && p2<b) {
            if(n[p1]<= m[p2]) {
                sb.append(n[p1++]).append(" ");
            }
            else {
                sb.append(m[p2++]).append(" ");
            }
        }

        if (p1 == a) {
            for (int i = p2; i < b; i++){
                sb.append(m[i]).append(" ");
            }
        }

        if (p2 == b){
            for (int i = p1; i < a; i++){
                sb.append(n[i]).append(" ");
            }
        }

        System.out.println(sb);
    }
}