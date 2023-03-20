package org.coding.lv0.p120895;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("hello -> 1번 인덱스와 2번 인덱스를 바꾼다. hlelo")
    void t1() {
        assertThat(new Solution().solution("hello", 1, 2)).isEqualTo("hlelo");
    }
}