package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inf2S06 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        ArrayList<Integer> solution = solution(n, arr);

        for (int x : solution) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int temp = arr[i];
            int res = 0;
            while (temp > 0){
                int num = temp % 10;
                res = res * 10 + num;
                temp = temp / 10;
            }

            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    private static boolean isPrime(int num) {
        if (num == 1){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

//    private static int[] solution(int n, int[] arr) {
//        List<Integer> arrList = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            int num = arr[i];
//
//            int ones = num % 10;
//            int tens = num / 10;
//            int swapped = ones * 10 + tens; // 10의 자리와 1의 자리를 바꿈
//            arr[i] = swapped;
//
//
//            if (isPrime(arr[i])){
//                arrList.add(arr[i]);
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        int[] primeNumber = new int[arrList.size()];
//        for (int i = 0; i < arrList.size(); i++){
//            primeNumber[i] = arrList.get(i);
//        }
//
//        return primeNumber;
//    }
//
//    private static boolean isPrime(int n) {
//        if (n <= 1){
//            return false;
//        }
//
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
}
