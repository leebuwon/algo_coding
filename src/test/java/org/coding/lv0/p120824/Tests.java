package org.coding.lv0.p120824;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("[1, 2, 3, 4, 5] -> [2, 3]")
    void t1() {
        int[] n = {1, 2, 3, 4 ,5};
        int[] answer = {2, 3};
        assertThat(new Solution().solution(n)).isEqualTo(answer);
    }

    @Test
    @DisplayName("[1, 3, 5, 7] -> [0, 4]")
    void t2() {
        int[] n = {1, 3, 5, 7};
        int[] answer = {0, 4};
        assertThat(new Solution().solution(n)).isEqualTo(answer);
    }
}