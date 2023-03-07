package org.coding.lv0.p120851;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("aAb1B2cC34oOp -> 10")
    void t1() {
        assertThat(new Solution().solution("aAb1B2cC34oOp")).isEqualTo(10);
    }

    @Test
    @DisplayName("1a2b3c4d123 -> 16")
    void t2() {
        assertThat(new Solution().solution("1a2b3c4d123")).isEqualTo(16);
    }

    @Test
    @DisplayName("5a6a7a8a -> 26")
    void t3() {
        assertThat(new Solution().solution("5a6a7a8a")).isEqualTo(26);
    }

}