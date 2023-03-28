package org.coding.lv0.p120838;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("모스부호 .... . .-.. .-.. --- 는 hello")
    void t1() {
        Assertions.assertThat(new Solution().solution(".... . .-.. .-.. ---")).isEqualTo("hello");
    }

}