package org.coding.backJoon.bronze.p10817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P10817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        Collections.sort(arr);

        System.out.println(arr.get(1));
    }
}
