package org.coding.inflearn;

public class Inf7S04 {
    static int[] fibo;
    public static void main(String[] args) {
        solution(45);
    }

    private static void solution(int n) {
        fibo = new int[n + 1];
        recursive(n);
        for (int i = 1; i <= n; i++){
            System.out.print(recursive(i) + " ");
        }
    }

    private static int recursive(int n) {
        // 메모리제이션
        if (fibo[n] > 0) return fibo[n];
        if (n == 1){
            return 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = recursive(n - 2) + recursive(n - 1);
        }
    }
}
