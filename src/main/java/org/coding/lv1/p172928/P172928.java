package org.coding.lv1.p172928;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class P172928 {
    public static void main(String[] args) {
//        String[] str = {"SOO","00O","OOO"};
//        String[] routes = {"E 2","S 2","W 1"};

//        String[] str = {"SOO","OXX","OOO"};
//        String[] routes = {"E 2","S 2","W 1"};

        String[] str = {"OSO","OOO","0XO","0OO"};
        String[] routes = {"E 2","S 3","W 1"};
        new Solution().solution(str, routes);
    }
}


class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        String[][] routeArr = new String[park.length][park[0].length()];

        int x = 0;
        int y = 0;
        for (int i = 0; i < park.length; i++) {
            String row = park[i];
            for (int j = 0; j < park[i].length(); j++) {
                routeArr[i][j] = row.substring(j, j + 1);
                if (routeArr[i][j].equals("S")){
                    x = j;
                    y = i;
                }
            }
        }

        int currentX = x; // 열
        int currentY = y; // 행

        for (int i = 0; i < routes.length; i++){
            char c = routes[i].charAt(0);
            char countChar = routes[i].charAt(routes[i].length() - 1);
            int count = countChar - '0';

            // 동쪽 이동
            if (c == 'E') {
                if (currentX + count < park[0].length()) {
                    for (int j = 0; j < count; j++) {
                        x += 1;
                        if (routeArr[y][x].equals("X")) {
                            x = currentX;
                            break;
                        }
                    }
                }
                currentX = x;
            }

            // 서쪽 이동
            if (c == 'W') {
                if (currentX - count >= 0) {
                    for (int j = 0; j < count; j++) {
                        x -= 1;
                        if (routeArr[y][x].equals("X")) {
                            x = currentX;
                            break;
                        }
                    }
                }
                currentX = x;
            }

            // 남쪽 이동
            if (c == 'S') {
                if (currentY + count < park.length) {
                    for (int j = 0; j < count; j++) {
                        y += 1;
                        if (routeArr[y][x].equals("X")) {
                            y = currentY;
                            break;
                        }
                    }
                }
                currentY = y;
            }

            // 북쪽 이동
            if (c == 'N') {
                if (currentY - count >= 0) {
                    for (int j = 0; j < count; j++) {
                        y -= 1;
                        if (routeArr[y][x].equals("X")) {
                            y = currentY;
                            break;
                        }
                    }
                }
                currentY = y;
            }
        }

        answer[0] = currentY;
        answer[1] = currentX;

        return answer;
    }
}