package org.coding.lv0.p120821;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("[3, 6, 8, 9, 12] -> [12, 9, 8, 6, 3]")
    void t1() {
        int[] n = {3, 6, 8, 9, 12};
        int[] reverseN = {12, 9, 8, 6, 3};
        assertThat(new Solution().solution(n)).isEqualTo(reverseN);
    }

    @Test
    @DisplayName("[1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]")
    void t2() {
        int[] n = {1, 2, 3, 4, 5};
        int[] reverseN = {5, 4, 3, 2, 1};
        assertThat(new Solution().solution(n)).isEqualTo(reverseN);
    }


}