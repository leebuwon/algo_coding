package org.coding.inflearn;

public class Inf7S01 {
    public static void main(String[] args) {
        recursive(3);
    }

    private static void recursive(int n) {
        if (n == 0) {
            return;
        } else {
            recursive(n - 1);
            System.out.println(n);
        }
    }
}
