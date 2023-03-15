package org.coding.lv0.p120905;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {
    @Test
    @DisplayName("N = 3, numList = [4, 5, 6, 7, 8, 9, 10, 11, 12] 이라면 result = [6, 9, 12]")
    void t1() {
        int[] numList = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] result = {6, 9, 12};
        assertThat(new Solution().solution(3, numList)).isEqualTo(result);
    }

    @Test
    @DisplayName("N = 5, numList = [1, 9, 3, 10, 13, 5] 이라면 result = [10, 5]")
    void t2() {
        int[] numList = {1, 9, 3, 10, 13, 5};
        int[] result = {10, 5};
        assertThat(new Solution().solution(5, numList)).isEqualTo(result);
    }

    @Test
    @DisplayName("N = 12, numList = [2, 100, 120, 600, 12, 12] 이라면 result = [120, 600, 12, 12]")
    void t3() {
        int[] numList = {2, 100, 120, 600, 12, 12};
        int[] result = {120, 600, 12, 12};
        assertThat(new Solution().solution(12, numList)).isEqualTo(result);
    }

}