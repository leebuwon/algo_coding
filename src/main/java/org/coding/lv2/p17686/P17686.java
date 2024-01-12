package org.coding.lv2.p17686;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P17686 {
    public static void main(String[] args) {
        String[] str = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
//        String[] str = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        new Solution().solution(str);
    }
}

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (o1, o2) -> {
            String[] str1 = o1.split("[0-9]");
            String[] str2 = o2.split("[0-9]");

            int alphabet = str1[0].compareToIgnoreCase(str2[0]);
            if (alphabet == 0) {
                Pattern pattern = Pattern.compile("[0-9]+");

                Matcher matcher1 = pattern.matcher(o1);
                Matcher matcher2 = pattern.matcher(o2);

                if (matcher1.find() && matcher2.find()) {
                    return Integer.compare(Integer.parseInt(matcher1.group()), Integer.parseInt(matcher2.group()));
                }
            }

            return str1[0].compareToIgnoreCase(str2[0]);
        });


        System.out.println(Arrays.toString(files));
        return files;
    }
}