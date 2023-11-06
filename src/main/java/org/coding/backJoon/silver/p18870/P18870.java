package org.coding.backJoon.silver.p18870;

import java.io.*;
import java.util.*;

public class P18870 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, arr);
    }

    private static void solution(int n, int[] arr) {
        int[] sortArr = arr.clone();

        Arrays.sort(sortArr);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int num : sortArr){
            if (!map.containsKey(num)){
                map.put(num, idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : arr){
            sb.append(map.get(num)).append(' ');
        }

        System.out.println(sb.toString());

    }


    /**
     * 시간 초과
     */
//    private static void solution(int n, int[] arr) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Set<Integer> setList = new HashSet<>();
//        List<Integer> result = new ArrayList<>();
//
//        for (int num : arr){
//            setList.add(num);
//        }
//
//        List<Integer> arrList = new ArrayList<>(setList);
//
//        Collections.sort(arrList);
//
//        for (int num : arr){
//            int index = arrList.indexOf(num);
//            result.add(index);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int num : result){
//            sb.append(num).append(' ');
//        }
//
//        System.out.println(sb.toString());
//    }
}
