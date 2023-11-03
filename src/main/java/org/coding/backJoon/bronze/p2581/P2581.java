package org.coding.backJoon.bronze.p2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 에라토스테네스의 체
 */
public class P2581 {
    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        solution(n, m);
    }

    private static void solution(int n, int m) {
        isPrime = new boolean[m + 1];
        get_prime();

        System.out.println(Arrays.toString(isPrime));

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = n; i <= m; i++) {
            if (!isPrime[i]) {
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    private static void get_prime() {
        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(isPrime.length); i++) {
            if (isPrime[i]) continue;
            for (int j = i * i; j < isPrime.length; j += i) {
                isPrime[j] = true;
            }
        }
    }
}

//    private static void solution(int n, int m) {
//        int answer = 0;
//
//        List<Integer> arrList = new ArrayList<>();
//        for (int i = n; i <= m; i++){
//            int num = primeNumber(i);
//
//            if (num != 0){
//                arrList.add(num);
//            }
//        }
//
//        for (int i = 0; i < arrList.size(); i++){
//            answer += arrList.get(i);
//        }
//
//        if (answer == 0){
//            System.out.println(-1);
//        } else {
//            System.out.println(answer);
//            System.out.println(arrList.get(0));
//        }
//    }
//
//    private static int primeNumber(int num) {
//        if (num == 1){
//            return 0;
//        }
//
//        for (int i = 2; i < num; i++){
//            if (num % i == 0){
//                return 0;
//            }
//        }
//
//        return num;
//    }
//}
