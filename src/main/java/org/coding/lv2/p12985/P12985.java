package org.coding.lv2.p12985;

public class P12985 {
    public static void main(String[] args) {
        new Solution().solution(8, 4, 7);
    }
}

/**
 * 풀이 참조
 */
class Solution{
    public int solution(int n, int a, int b){
        int answer = 0;

        while(true){

            // 0
            // 1, 12
            // 1
            // 1, 6
            // 2
            // 1, 3
            // 3
            // 1, 2
            // 4
            // 1, 1

            // 1 2
            // 3 4
            // 5 6
            // 7 8
            // 9 10
            // 11 12
            // 13 14
            // 15 16

            // 1(1) 2(3)
            // 1(5) 2(7)
            // 1(9) 2(12)
            // 1(13) 2(15)

            // 1(1) 2(5)
            // 1(12) 2(13)

            // 1(1) 2(12)


            a = (a + 1) / 2;
            b = (b + 1) / 2;

            answer++;

            if (a == b){
                break;
            }

        }

        return answer;
    }
}