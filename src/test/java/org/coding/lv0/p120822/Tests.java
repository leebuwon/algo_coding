package org.coding.lv0.p120822;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("jaron -> noraj")
    void t1() {
        assertThat(new Solution().solution("buwon")).isEqualTo("nowub");
    }

    @Test
    @DisplayName("bread -> daerb")
    void t2() {
        assertThat(new Solution().solution("bread")).isEqualTo("daerb");
    }
}