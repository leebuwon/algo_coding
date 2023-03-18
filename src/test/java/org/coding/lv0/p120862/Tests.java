package org.coding.lv0.p120862;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("[1, 2, -3, 4, -5]배열의 두 개의 최대 곱은 15")
    void t1() {
        int[] arr = {1, 2 , -3, 4, -5};

        assertThat(new Solution().solution(arr)).isEqualTo(15);
    }

    @Test
    @DisplayName("[0, -31, 24, 10, 1, 9]배열의 두 개의 최대 곱은 240")
    void t2() {
        int[] arr = {0, -31, 24, 10, 1, 9};

        assertThat(new Solution().solution(arr)).isEqualTo(240);
    }

    @Test
    @DisplayName("[10, 20, 30, 5, 5, 20, 5]배열의 두 개의 최대 곱은 600")
    void t3() {
        int[] arr = {10, 20, 30, 5, 5, 20, 5};

        assertThat(new Solution().solution(arr)).isEqualTo(600);
    }
}