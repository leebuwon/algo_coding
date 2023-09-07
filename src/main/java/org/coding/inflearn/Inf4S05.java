package org.coding.inflearn;

import java.io.IOException;
import java.util.*;

public class Inf4S05 {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(arr, n, k));
    }

    /**
     * 강사님 코드
     */
//    private static int solution(int[] arr, int n, int k) {
//        int answer = -1;
//        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder()); // 선언과 동시에 내림차순으로 자동정렬한다.
//        for (int i = 0; i < n; i++){
//            for (int j = i + 1; j < n; j++){
//                for (int l = j + 1; l < n; l++){
//                    treeSet.add(arr[i] + arr[j] + arr[l]);
//                }
//            }
//        }
//
//        int count = 0;
//        for (int x : treeSet){
//            count++;
//            if (count == k){
//                return x;
//            }
//        }
//
//        return answer;
//    }

    private static int solution(int[] arr, int n, int selectNum) {

        int answer = 0;

        Set<Integer> arrSet = new TreeSet<>(Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < n - 2; i++){
            for (int j = i + 1; j < n - 1; j++){
                for (int k = j + 1; k < n; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    arrSet.add(sum);
                }
            }
        }

//        System.out.println(Arrays.toString(arrSet.toArray(new Integer[0]))); // 모든 arrSet.size()를 받아온다고 생각하면된다.

        // arrSet.toArray(new Integer[0]) == arrSet.toArray(new Integer[arrSet.size()])
        Integer[] arrArray = arrSet.toArray(new Integer[0]);
        if (selectNum <= arrArray.length) {
            answer = arrArray[selectNum - 1];
            return answer;
        }

        return -1;
    }
}
