package org.coding.lv0.p120892;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("dfjardstddetckdaccccdegk => attack ")
    void t1() {
        assertThat(new Solution().solution("dfjardstddetckdaccccdegk", 4)).isEqualTo("attack");
    }

    @Test
    @DisplayName("pfqallllabwaoclk => fallback ")
    void t2() {
        assertThat(new Solution().solution("pfqallllabwaoclk", 2)).isEqualTo("fallback");
    }

    @Test
    @DisplayName("avlcoosevape => love ")
    void t3() {
        assertThat(new Solution().solution("avlcoosevape", 3)).isEqualTo("love");
    }
}