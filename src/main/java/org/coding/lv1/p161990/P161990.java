package org.coding.lv1.p161990;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class P161990 {
    public static void main(String[] args) {
//        String[] wallPaper = {".#...", "..#..", "...#."};
        String[] wallPaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
//        String[] wallPaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
//        String[] wallPaper = {"..", "#."};
//        String[] wallPaper = {"#.", ".."};
        new Solution().solution(wallPaper);
    }
}


class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int luxMinDrag = Integer.MAX_VALUE;
        int luyMinDrag = Integer.MAX_VALUE;
        int rdxMaxDrag = Integer.MIN_VALUE;
        int rdyMaxDrag = Integer.MIN_VALUE;

        for(int i = 0; i < wallpaper.length; i++){
            String str = wallpaper[i];
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if (c == '#' && luxMinDrag > i){
                    luxMinDrag = i;
                }

                if (c == '#' && luyMinDrag > j){
                    luyMinDrag = j;
                }

                if (c == '#' && rdxMaxDrag <= i){
                    rdxMaxDrag = i + 1;
                }

                if (c == '#' && rdyMaxDrag <= j){
                    rdyMaxDrag = j + 1;
                }
            }
        }

        List<Integer> arrList = new ArrayList<>();
        arrList.add(luxMinDrag);
        arrList.add(luyMinDrag);
        arrList.add(rdxMaxDrag);
        arrList.add(rdyMaxDrag);

        for (int i = 0; i < answer.length; i++){
            answer[i] += arrList.get(i);
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

/**
 * 다른사람 풀이
 */
//class Solution {
//    public int[] solution(String[] wallpaper) {
//        int minX = Integer.MAX_VALUE;
//        int minY = Integer.MAX_VALUE;
//        int maxX = Integer.MIN_VALUE;
//        int maxY = Integer.MIN_VALUE;
//        for(int i=0; i< wallpaper.length;i++ ){
//            for(int j=0; j<wallpaper[i].length();j++){
//                if(wallpaper[i].charAt(j)=='#'){
//                    minX = Math.min(minX,i);
//                    minY = Math.min(minY,j);
//                    maxX = Math.max(maxX,i);
//                    maxY = Math.max(maxY,j);
//                }
//            }
//        }
//        return new int[]{minX,minY,maxX+1,maxY+1};
//    }
//}