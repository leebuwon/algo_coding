package org.coding.lv0.p120956;

public class P120956 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] rep = {"aya", "ye", "woo", "ma"};

        String[] copy = new String[babbling.length];
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(String str : babbling){
            for(int i = 0; i < rep.length; i++){
                str = str.replace(rep[i], " ");
            }

            str = str.replace(" ", "");
            copy[count] = str;
            count++;
        }

        for(int i = 0; i < copy.length; i++){
            if(copy[i].isEmpty()){
                answer++;
            }
        }


        return answer;
    }
}