package org.coding.lv1.p250137;

public class P250137 {
    public static void main(String[] args) {
//        int[] bandage = {5, 1, 5};
//        int health = 30;
//        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
//        int[] bandage = {3, 2, 7};
//        int health = 20;
//        int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};
        int[] bandage = {2, 4, 4};
        int health = 20;
        int[][] attacks = {{1, 10},{2, 9}, {6, 16}};
        new Solution().solution(bandage, health, attacks);
    }
}

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health; // 최대 체력
        for(int i = 0; i < attacks.length - 1; i++){
            if(health <= 0){ // for 문 탈출
                return -1;
            }

            health -= attacks[i][1];

            if (health <= 0){
                return -1;
            }

            int time = attacks[i + 1][0] - attacks[i][0];
            if(time > bandage[0]){
                time--;

                int bonusHealth = time / bandage[0];

                health += time * bandage[1];
                health += bonusHealth * bandage[2];
                if (health > maxHealth){ // 만약 최대 체력을 넘어가면 다시 30으로 초기화
                    health = maxHealth;
                }
            } else if (time == 1){
                continue;
            }else {
                time--;
                health += time * bandage[1];
                if (health > maxHealth){ // 만약 최대 체력을 넘어가면 다시 30으로 초기화
                    health = maxHealth;
                }
            }
        }


        health -= attacks[attacks.length - 1][1];

        if (health <= 0){
            return -1;
        }

        System.out.println(health);

        return health;
    }
}