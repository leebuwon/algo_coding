package org.coding.lv3.p42579;

import java.util.*;
public class P42579 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        new Solution().solution(genres, plays);
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotalPlays = new HashMap<>();
        Map<String, Map<Integer, Integer>> genreMusicMap = new HashMap<>();


        for (int i = 0; i < plays.length; i++) {
            String currentGenre = genres[i];
            int currentPlayCount = plays[i];

            genreTotalPlays.put(currentGenre, genreTotalPlays.getOrDefault(currentGenre, 0) + currentPlayCount);

            System.out.println(genreTotalPlays);

            if (!genreMusicMap.containsKey(currentGenre)) {
                genreMusicMap.put(currentGenre, new HashMap<>());
            }
            genreMusicMap.get(currentGenre).put(i, currentPlayCount);
        }
        System.out.println(genreMusicMap);

        List<String> sortedGenres = new ArrayList<>(genreTotalPlays.keySet());
        sortedGenres.sort((g1, g2) -> genreTotalPlays.get(g2) - genreTotalPlays.get(g1));

        List<Integer> answerList = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<Integer> genreMusicKeys = new ArrayList<>(genreMusicMap.get(genre).keySet());
            genreMusicKeys.sort((m1, m2) -> genreMusicMap.get(genre).get(m2) - genreMusicMap.get(genre).get(m1));

            answerList.add(genreMusicKeys.get(0));
            if (genreMusicKeys.size() > 1) {
                answerList.add(genreMusicKeys.get(1));
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}