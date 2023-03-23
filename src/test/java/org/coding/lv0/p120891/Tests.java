package org.coding.lv0.p120891;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("order = 3, result = 1")
    void t1() {
        assertThat(new Solution().solution(3)).isEqualTo(1);
    }

    @Test
    @DisplayName("order = 29423, result = 2")
    void t2() {
        assertThat(new Solution().solution(29423)).isEqualTo(2);
    }

    @Test
    @DisplayName("order = 0, result = 0")
    void t3() {
        assertThat(new Solution().solution(0)).isEqualTo(0);
    }
}