package org.coding.lv0.p120842;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("2차원으로 만들기")
    void t1() {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int[][] result = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        Assertions.assertThat(new Solution().solution(num_list, 2)).isEqualTo(result);
    }
}