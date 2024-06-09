package org.coding.lv0.p120883;

public class P120883 {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        boolean id = false;
        boolean pw = false;

        for(int i = 0; i < db.length; i++){
            String[] str = db[i];

            if(id_pw[0].equals(str[0])){
                id = true;
            }

            if(id_pw[1].equals(str[1])){
                pw = true;
            }

            if(id && pw){
                answer = "login";
                break;
            } else if(id){
                answer = "wrong pw";
            } else {
                if(!answer.equals("wrong pw")){
                    answer = "fail";
                }
            }

            id = false;
            pw = false;
        }


        return answer;
    }
}