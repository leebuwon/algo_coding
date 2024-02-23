package org.coding.lv2.p87946;

/**
 * 풀이 참조
 */
public class P87946 {
    public static void main(String[] args) {
        int[][] dungeons = {{80,20}, {50,40}, {30,10}};
        new Solution().solution(80, dungeons);
    }
}

class Solution {
    public static boolean[] visited;
    public static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(dungeons, k, 0);

        System.out.println(answer);
        return answer;
    }

    private void dfs(int[][] dungeons, int k, int num) {
        for (int i = 0; i < dungeons.length; i++){
            if (!visited[i]&& k >= dungeons[i][0]){
                visited[i] = true;
                dfs(dungeons, k - dungeons[i][1], num + 1);
                visited[i] = false;
            }
        }

        if (answer < num){
            answer = num;
        }
    }
}