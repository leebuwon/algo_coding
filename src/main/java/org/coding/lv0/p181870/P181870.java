package org.coding.lv0.p181870;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181870 {
    public static void main(String[] args) {
        String[] arr = {"ab", "ac", "ad", "ae"};
        new Solution().solution(arr);
    }
}

class Solution {
    public String[] solution(String[] strArr) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++){
            if (!strArr[i].contains("ad")){
                stringList.add(strArr[i]);
            }
        }
        String[] answer = new String[stringList.size()];
        for (int i = 0; i < stringList.size(); i++){
            answer[i] = stringList.get(i);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}