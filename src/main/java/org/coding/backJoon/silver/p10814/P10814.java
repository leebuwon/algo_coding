package org.coding.backJoon.silver.p10814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P10814 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[][] ageWithName = new String[n][2];

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            ageWithName[i][0] = st.nextToken();
            ageWithName[i][1] = st.nextToken();
        }

        solution(ageWithName);
    }

    private static void solution(String[][] ageWithName) {

        // 이 로직은 시간 초과 걸림
//        for (int i = 0; i < ageWithName.length - 1; i++) {
//            for (int j = 0; j < ageWithName.length - i - 1; j++) {
//                int age1 = Integer.parseInt(ageWithName[j][0]);
//                int age2 = Integer.parseInt(ageWithName[j + 1][0]);
//                if (age1 > age2) {
//                    String[] temp = ageWithName[j];
//                    ageWithName[j] = ageWithName[j + 1];
//                    ageWithName[j + 1] = temp;
//                }
//            }
//        }

        // 위의 로직을 한줄로 수정
        Arrays.sort(ageWithName, Comparator.comparingInt(entry -> Integer.parseInt(entry[0])));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ageWithName.length; i++){
            sb.append(ageWithName[i][0]).append(" ").append(ageWithName[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}


/**
 * 다른 풀이
 */
//public class P10814 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        Person[] p = new Person[n];
//
//        for (int i = 0; i < n; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            int age = Integer.parseInt(st.nextToken());
//            String name = st.nextToken();
//            p[i] = new Person(age, name);
//        }
//
//        Arrays.sort(p, Comparator.comparingInt(person -> person.age));
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++){
//            sb.append(p[i]);
//        }
//
//        System.out.println(sb);
//    }
//
//    private static class Person {
//        int age;
//        String name;
//
//        public Person(int age, String name) {
//            this.age = age;
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return age + " " + name + "\n";
//        }
//    }
//}