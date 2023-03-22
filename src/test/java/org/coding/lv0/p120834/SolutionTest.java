package org.coding.lv0.p120834;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    @DisplayName("23살이라면 외계행성 나이는 cd이다.")
    void t1() {
        assertThat(new Solution().solution(23)).isEqualTo("cd");
    }

    @Test
    @DisplayName("51살이라면 외계행성 나이는 fb이다.")
    void t2() {
        assertThat(new Solution().solution(51)).isEqualTo("fb");
    }

}