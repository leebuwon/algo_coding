package org.coding.backJoon.silver.p4134;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class P4134 {
    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long number = Long.parseLong(br.readLine());
            BigInteger bigInteger = new BigInteger(String.valueOf(number));

            // 현재 수가 소수면 그냥 출력
            if (bigInteger.isProbablePrime(10)){
                System.out.println(bigInteger);

            }
            // 현재 수가 소수가 아니면 다음 소수로 출력
            else {
                System.out.println(bigInteger.nextProbablePrime());
            }


        }
    }

//    private static void solution(BigInteger num) {
//        if (num.isProbablePrime(10)) {
//            System.out.print(num + "\n");
//        } else {
//            System.out.print(num.nextProbablePrime() + "\n");
//        }
//    }
}


/**
 * NumberFormatException
 * 출력 크기가 40억으로 넘어커서 나오는 것 같다.
 * 그래서 서칭 후 BigInteger 활용
 */

//    private static void solution(long num) {
//        long nextPrime;
//        while (true){
//            num++;
//            boolean flag = prime(num);
//
//            if (flag){
//                nextPrime = num;
//                break;
//            }
//
//        }
//
//        System.out.println(nextPrime);
//    }
//
//    private static boolean prime(long num) {
//        isPrime = new boolean[(int) (num + 1)];
//
//        isPrime[0] = true;
//        isPrime[1] = true;
//
//        for (int i = 2; i <= Math.sqrt(isPrime.length); i++){
//            if (isPrime[i]){
//                continue;
//            }
//            for (long j = (long) i * i; j < isPrime.length; j+= i){
//                isPrime[(int) j] = true;
//            }
//        }
//
//        return !isPrime[isPrime.length - 1];
//    }
//}


//        if (num == 1){
//            return false;
//        }
//
//        for (int i = 2; i < num; i++){
//            if (num % i == 0){
//                return false;
//            }
//        }
//
//        return true;