package org.coding.backJoon.bronze.p2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        List<Integer> arrList = new ArrayList<>();

        for (int i = 1; i <= p; i++){
            if (p % i == 0){
                arrList.add(i);
            }
        }

        int answer = 0;
        for (int i = 0; i < arrList.size(); i++){
            if (i == q - 1){
                answer = arrList.get(i);
            }
        }

        if (answer == 0){
            System.out.print(answer);
        } else {
            System.out.print(answer);
        }
    }
}
