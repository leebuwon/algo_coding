package org.coding.backJoon.silver.p2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));

    }

    private static int solution(String str) {
        int answer = 0;

        String replace = str.replace("c=", "1").replace("c-", "1")
                .replace("dz=", "1").replace("d-", "1")
                .replace("lj", "1").replace("nj", "1")
                .replace("s=", "1").replace("z=", "1");

        answer += replace.length();

        return answer;
    }
}
