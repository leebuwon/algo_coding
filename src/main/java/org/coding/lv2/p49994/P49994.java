package org.coding.lv2.p49994;

import java.util.*;
public class P49994 {
    public static void main(String[] args) {
        new Solution().solution("ULURRDLLU");
    }
}

// 좌표를 set에 저장하여 풀이하는 방법 (내 코드 기반으로 gpt 활용)
class Solution {
    static Set<String> set = new HashSet<>();
    static int x = 5;
    static int y = 5;
    public int solution(String dirs) {

        String[] directions = dirs.split("");

        for(String direction : directions){
            moves(direction);
        }

        return set.size() / 2;
    }

    private void moves(String direction){
        int newX = x;
        int newY = y;

        if (direction.equals("U")) {
            newX--;
        } else if (direction.equals("D")) {
            newX++;
        } else if (direction.equals("R")) {
            newY++;
        } else if (direction.equals("L")) {
            newY--;
        }

        if (newX >= 0 && newX <= 10 && newY >= 0 && newY <= 10) {
            String path1 = x + "," + y + "-" + newX + "," + newY;
            String path2 = newX + "," + newY + "-" + x + "," + y;
            set.add(path1);
            set.add(path2);

            x = newX;
            y = newY;
        }
    }
}

/* 틀린 풀이
class Solution {
    static int[][] maps;
    static int x = 5;
    static int y = 5;
    public int solution(String dirs) {
        int answer = 0;
        maps = new int[11][11];

        String[] direction = dirs.split("");

        maps[x][y] = 1;

        for(int i = 0; i < direction.length; i++){
            moves(direction[i]);
        }

        System.out.println(Arrays.deepToString(maps));
        return answer;
    }

    private void moves(String dire){
        int newX = x;
        int newY = y;

        if (dire.equals("U")) {
            newX--;
        } else if (dire.equals("D")) {
            newX++;
        } else if (dire.equals("R")) {
            newY++;
        } else if (dire.equals("L")) {
            newY--;
        }

        if (newX >= 0 && newX <= 10 && newY >= 0 && newY <= 10) {
            x = newX;
            y = newY;
            maps[x][y]++;
        }
    }
}

*/

/*
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 2, 1, 1, 0, 0, 0, 0],
[0, 0, 0, 0, 2, 2, 1, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 */
