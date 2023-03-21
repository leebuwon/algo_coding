package org.coding.lv0.p120899;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("[1, 8, 3] 배열 중 가장 큰 수는 8이고, 배열의 인덱스는 1이다.")
    void t1(){
        int[] arr = {1, 8, 3};
        int[] result = {8, 1};
        Assertions.assertThat(new Solution().solution(arr)).isEqualTo(result);
    }

    @Test
    @DisplayName("[9, 10, 11, 8] 배열 중 가장 큰 수는 11이고, 배열의 인덱스는 2이다.")
    void t2(){
        int[] arr = {9, 10, 11, 8};
        int[] result = {11, 2};
        Assertions.assertThat(new Solution().solution(arr)).isEqualTo(result);
    }

}