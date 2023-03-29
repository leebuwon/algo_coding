package org.coding.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 */

public class Inf1S01 {
    public int solution(String str, char c){ // 프로그래머스식 입력 방식
        int answer = 0;
        str = str.toUpperCase(); // 모든 str을 대문자로 바꾼다.
        c = Character.toUpperCase(c); // 문자 c를 대문자로 바꾼다.

//        for (int i = 0; i < str.length(); i++){
//            if (str.charAt(i) == c) // str의 문자열 배열안에 c의 문자랑 같으면 answer를 더해준다.
//                answer++;
//        }

        // 위의 for문을 foreach문으로 수정한 부분
        for (char x : str.toCharArray()) { // 새로운 문자 배열을 추가해준다.
            if (x == c) answer++;
        }

        return answer; // answer를 리턴해준다.
    }

    public static void main(String[] args) throws IOException { // 백준 방식의 입력
        Inf1S01 T = new Inf1S01();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char inputWord = br.readLine().charAt(0); // charAt(0)번에 있는 문자 한개를 가져와라
        System.out.println(T.solution(str, inputWord));
    }
}
