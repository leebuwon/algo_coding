package org.coding.lv1.p12928;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("약수 더하기 -> 12의 약수를 더하면 28")
    void t1() {
        Assertions.assertThat(new Solution().solution(12)).isEqualTo(28);
    }

    @Test
    @DisplayName("약수 더하기 -> 5의 약수를 더하면 6")
    void t2() {
        Assertions.assertThat(new Solution().solution(5)).isEqualTo(6);
    }

}