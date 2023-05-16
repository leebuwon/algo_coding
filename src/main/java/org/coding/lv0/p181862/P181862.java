package org.coding.lv0.p181862;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181862 {
    public static void main(String[] args) {
        new Solution().solution("baconlettucetomato");

    }
}

class Solution {
    public String[] solution(String myStr) {
        String[] split = myStr.split("");

        for (int i = 0; i < split.length; i++){
            if (split[i].equals("a") || split[i].equals("b") || split[i].equals("c")){
                split[i] = "";
            }
        }
        System.out.println(Arrays.toString(split));

        List<String> list = new ArrayList<>();
        String result = "";
        for (int i = 0; i < split.length; i++){
            if (!split[i].equals("")) {
                result += split[i];
            }

            else if (!result.equals("")) {
                list.add(result);
                result = ""; // result에 문자가 담기고 다음에 split에 빈문자열이 들어온다면 add로 list에 담아주고 result 초기화 해준다.
            }
        }

        if (!result.equals("")) { // to는 배열에 length만큼 순회했으니 나와서 밖에서 list에 담아준다.
            list.add(result);
        }

        if (result.isEmpty()){
            list.add("EMPTY");
        }

        String[] answer = list.toArray(new String[list.size()]);

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}