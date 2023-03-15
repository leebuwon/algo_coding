package org.coding.lv0.p120850;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("hi12392 -> [1, 2, 2, 3, 9]")
    void t1() {
        int[] n = {1, 2, 2, 3, 9};
        Assertions.assertThat(new Solution().solution("hi12392")).isEqualTo(n);
    }

    @Test
    @DisplayName("p2o4i8gj2 -> [2, 2, 4, 8]")
    void t2() {
        int[] n = {2, 2, 4, 8};
        Assertions.assertThat(new Solution().solution("p2o4i8gj2")).isEqualTo(n);
    }

    @Test
    @DisplayName("abcde0 -> [0]")
    void t3() {
        int[] n = {0};
        Assertions.assertThat(new Solution().solution("abcde0")).isEqualTo(n);
    }


}