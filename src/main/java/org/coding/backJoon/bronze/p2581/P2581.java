package org.coding.backJoon.bronze.p2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        solution(n, m);
    }

    private static void solution(int n, int m) {
        int answer = 0;

        List<Integer> arrList = new ArrayList<>();
        for (int i = n; i <= m; i++){
            int num = primeNumber(i);

            if (num != 0){
                arrList.add(num);
            }
        }

        for (int i = 0; i < arrList.size(); i++){
            answer += arrList.get(i);
        }

        if (answer == 0){
            System.out.println(-1);
        } else {
            System.out.println(answer);
            System.out.println(arrList.get(0));
        }
    }

    private static int primeNumber(int num) {
        if (num == 1){
            return 0;
        }

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return 0;
            }
        }

        return num;
    }
}
