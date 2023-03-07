package org.coding.lv0.p120906;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("1234 = 10")
    void t1(){
        assertThat(new Solution().solution(1234)).isEqualTo(10);
    }

    @Test
    @DisplayName("369 = 18")
    void t2(){
        assertThat(new Solution().solution(369)).isEqualTo(18);
    }

    @Test
    @DisplayName("555 = 15")
    void t3(){
        assertThat(new Solution().solution(555)).isEqualTo(15);
    }
}