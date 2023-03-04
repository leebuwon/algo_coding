package org.coding.lv0.p120814;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Tests {

    @Test
    @DisplayName("사람이 7명일 경우 피자는 1판 이어야 한다.")
    void t1() {
        assertThat(new Solution().solution(7)).isEqualTo(1);
    }

    @Test
    @DisplayName("사람이 10명일 경우 피자는 2판 이어야 한다.")
    void t2() {
        assertThat(new Solution().solution(10)).isEqualTo(2);
    }

    @Test
    @DisplayName("사람이 15명일 경우 피자는 3판 이어야 한다.")
    void t3() {
        assertThat(new Solution().solution(15)).isEqualTo(3);
    }


}