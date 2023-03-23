package org.coding.lv0.p120897;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("약수구하기! n = 24라면, result는 [1, 2, 3, 4, 6, 8, 12, 24]")
    void t1() {
        int[] result = {1, 2, 3, 4, 6, 8, 12, 24};
        assertThat(new Solution().solution(24)).isEqualTo(result);
    }

    @Test
    @DisplayName("약수구하기! n = 29라면, result는 [1, 29]")
    void t2() {
        int[] result = {1, 29};
        assertThat(new Solution().solution(29)).isEqualTo(result);
    }

}