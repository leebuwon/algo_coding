package org.coding.lv0.p120814;

public class Main {

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 7;
        if (n % pizza == 0){
            answer = n / pizza;
        } else
            // n이 15일떄 7로 나누면 2가 나온다 +한명당 1조각 씩 먹을 수 있어야 하니간 +1을 해준다.
            answer = n / pizza + 1;

        return answer;
    }
}