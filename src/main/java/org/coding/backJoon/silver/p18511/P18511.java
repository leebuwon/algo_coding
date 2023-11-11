package org.coding.backJoon.silver.p18511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * dfs 풀이
 */
public class P18511 {

    static int n;
    static int m;

    static int max = Integer.MIN_VALUE;
    static int[] target;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        target = new int[m];
        result = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(target);

        dfs(0);

        System.out.println(max);

//        solution(n);
    }

    private static void dfs(int num) {
        if (num > n) return;

        if (max < num){
            max = num;
        }

        for (int i = m - 1; i >= 0; i--){
            dfs(num * 10 + target[i]);
        }
    }


    /**
     * 틀린 풀이
     */
//    private static void solution(int n) {
//        recursive(0, 0, n);
//
//        System.out.println(max);
//    }
//
//    private static void recursive(int cnt, int idx, int n) {
//        if (cnt == result.length){
//            StringBuilder sb = new StringBuilder();
//            for (int num : result) {
//                sb.append(num);
//            }
//
//            int currentValue = Integer.parseInt(sb.toString());
//            if (n >= currentValue && max < currentValue){
//                max = currentValue;
//            }
//            return;
//        }
//
//        for (int i = idx; i < target.length; i++){
//            result[cnt] = target[i];
//
//            recursive(cnt + 1, i, n);
//        }
//    }
//}
}