package org.coding.lv2.p12924;

public class P12924 {
    public static void main(String[] args) {
        new Solution().solution(15);
//        new Solution().solution(0);
//        new Solution().solution(1);
    }
}


class Solution {
    public int solution(int n) {
        int answer = 0;
        int split = 0;

        // n의 반이상 넘어가면 순차적으로 더했을 때 절대 n이 나올 수 없음
        if (n % 2 == 0){
            split = n / 2;
        } else {
            split = n / 2 + 1;
        }

        int sum = 0;
        for(int i = 1; i <= split; i++){
            int plus = i;
            while(sum < n){
                sum += plus++;
                if(sum == n){
                    answer++;
                    break;
                }
            }
            sum = 0;
        }

        if(n == 1){
            return answer;
        } else {
            answer += 1;
        }

        return answer;
    }
}

/**
 * 다른 사람 풀이
 * 가장 빠르다
 */
//class Solution {
//    public int solution(int num) {
//        int answer = 0;
//        for (int i = 1; i <= num; i += 2)
//            if (num % i == 0)
//                answer++;
//
//        return answer;
//    }
//}