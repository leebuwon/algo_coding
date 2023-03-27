package org.coding.lv0.p120888;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("people의 중복된 문자 제거는 peol 이다")
    void t1() {
        assertThat(new Solution().solution("people")).isEqualTo("peol");
    }

    @Test
    @DisplayName("We are the world의 중복된 문자 제거는 We arthwold 이다")
    void t2() {
        assertThat(new Solution().solution("We are the world")).isEqualTo("We arthwold");
    }

}