package org.coding.lv1.p12921;

public class P12921 {
    public static void main(String[] args) {
        new Solution().solution(10);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++){
            int num = i;
            if (prime(num)){
                answer++;
            }
        }

        System.out.println(answer);

        return answer;
    }

    private boolean prime(int num) {
        int sqrt = (int)Math.sqrt(num);
        System.out.println(sqrt);
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}

/**
 * 소수 구하는 다른 방법
 */
//class Solution {
//    public int solution(int n) {
//        int result = 0;
//        for(int i = 2 ; i <= n ; i++){
//            int count = 0;
//            for(int j = 2 ; j <= n; j++){
//                if (i % j == 0){
//                    count++;
//                }
//            }
//            if (count < 2){
//                result ++;
//            }
//        }
//
//        return result;
//    }
//}