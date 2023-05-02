package org.coding.lv0.p181914;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Tests {

    @Test
    @DisplayName("345가 들어오면 3을 리턴해야된다.")
    void t1() {
        Assertions.assertThat(new Solution().solution("345")).isEqualTo(3);
    }

    @Test
    @DisplayName("789가 들어오면 6을 리턴해야된다.")
    void t2() {
        Assertions.assertThat(new Solution().solution("789")).isEqualTo(6);
    }

}