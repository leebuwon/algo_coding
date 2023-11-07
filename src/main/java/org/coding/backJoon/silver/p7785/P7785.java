package org.coding.backJoon.silver.p7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class P7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        String[][] str = new String[n][2];
        for (int i = 0; i < str.length; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < str[i].length; j++){
                str[i][j] = st.nextToken();
            }
        }

        solution(n, str);
    }
    /**
     5
     Baha enter
     Askar enter
     Baha leave
     Artem enter
     A enter
     */
    private static void solution(int n, String[][] str) {
        List<String> strings = new ArrayList<>();
        Map<String, String> maps = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < str.length; i++){
            set.add(str[i][0]);
        }

        System.out.println(set);

        for (int i = 0; i < n; i++){
            maps.put(str[i][0], str[i][1]);
        }

        System.out.println(maps);

        for (String currentMember : set){
            if (maps.get(currentMember).equals("enter")){
                strings.add(currentMember);
            }
        }

        strings.sort(Collections.reverseOrder());

        for (int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }
    }
}
