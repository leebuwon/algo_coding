package org.coding.lv1.p140108;

public class P140108 {
    public static void main(String[] args) {
//        new Solution().solution("banana");
//        new Solution().solution("abracadabra");
//        new Solution().solution("aaabbaccccabba");
//        new Solution().solution("abaaaabb");
        new Solution().solution("aaba");
//        new Solution().solution("aaabbbc");
//        new Solution().solution("a");
    }
}


class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] split = s.split("");

        if (split.length == 1){
            answer++;
            return answer;
        }

        int idx = 0;

        while (idx < split.length){
            String x = split[idx];
            int startStringCount = 0;
            int anotherStringCount = 0;

            for (int i = idx; i < split.length; i++){
                if (x.equals(split[i])) {
                    startStringCount++;
                } else {
                    anotherStringCount++;
                }

                if (startStringCount == anotherStringCount && i != idx) {
                    idx = i + 1;
                    answer++;
                    break;
                }

                if (i == split.length - 1) {
                    return answer + 1;
                }
            }
        }

        System.out.println(answer);

        return answer;
    }
}