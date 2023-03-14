package org.coding.lv0.p120910;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("2를 10번 곱하면 ? 2048")
    void t1(){
        assertThat(new Solution().solution(2, 10)).isEqualTo(2048);
    }

    @Test
    @DisplayName("7를 15번 곱하면 ? 2048")
    void t2(){
        assertThat(new Solution().solution(7, 15)).isEqualTo(229376);
    }

}