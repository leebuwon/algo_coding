package org.coding.lv1.p147355;

public class P147355 {
    public static void main(String[] args) {
        new Solution().solution("3141592", "271");
    }
}

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        // 숫자로 비교하기 위하여 int형으로 바까준다.
        int intP = Integer.parseInt(p);
        for (int i = 0; i <= t.length() - p.length(); i++){
            // subString을 통해 i부터 i + 3의 길이만큼 잘라준다. 즉 314까지 잘라주고 그 다음에 141 이런식으로 잘라준다.
            int intT = Integer.parseInt(t.substring(i, i + p.length()));

            // 만약에 p가 t보다 크다면 answer에 1을 더해준다.
            if (intP >= intT){
                answer++;
            }
        }


        return answer;
    }
}
