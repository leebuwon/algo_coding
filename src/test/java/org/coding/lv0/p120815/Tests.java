package org.coding.lv0.p120815;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("사람이 10명 일 경우 동일한 수의 파지 조각을 먹을려면 최소 5판이 핑료하다.")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(5);
    }

    @Test
    @DisplayName("사람이 6명 일 경우 동일한 수의 파지 조각을 먹을려면 최소 1판이 핑료하다.")
    void t2() {
        assertThat(new Solution().solution(6)).isEqualTo(1);
    }

    @Test
    @DisplayName("사람이 4명 일 경우 동일한 수의 파지 조각을 먹을려면 최소 2판이 핑료하다.")
    void t3() {
        assertThat(new Solution().solution(4)).isEqualTo(2);
    }

    @Test
    @DisplayName("사람이 15명 일 경우 동일한 수의 파지 조각을 먹을려면 최소 5판이 핑료하다.")
    void t4() {
        assertThat(new Solution().solution(16)).isEqualTo(8);
    }

}