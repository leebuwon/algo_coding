package org.coding.inflearn;

import java.util.Scanner;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 *첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 */
// 해결 못함
public class Inf1S03 {
    public String solution(String str){
        String result = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1){ // 띄워쓰기를 발견하지 못하면 -1을 리턴하고 발견한다면 인덱스 번호를 리턴한다.
            String tmp = str.substring(0, pos); // 0부터 pos 전까지
            int len = tmp.length();
            if (len > m){ // 갱신하는 로직
                m = len;
                result = tmp;
            }
            str = str.substring(pos + 1); // 이 지점부터 끝까지 잘라내기, +1을 해줘야 스페이스 부분이 아닌 문자 부분으로 넘어간다.
        }
        if (str.length() > m) result = str; // 마지막 단어까지 가지 못하니간 따로 값을 주어 마지막 단어까지 들어가게 해준다.
        return result;
    }

    public static void main(String[] args) {
        Inf1S03 T = new Inf1S03();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}