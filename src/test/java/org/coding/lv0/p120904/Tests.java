package org.coding.lv0.p120904;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("num에 같은 숫자가 있으면 index번호 return 없다면 -1 return")
    void t1() {
        assertThat(new Solution().solution(29183, 1)).isEqualTo(3);
    }

    @Test
    @DisplayName("num에 같은 숫자가 있으면 index번호 return 없다면 -1 return")
    void t2() {
        assertThat(new Solution().solution(232443, 4)).isEqualTo(4);
    }

    @Test
    @DisplayName("num에 같은 숫자가 있으면 index번호 return 없다면 -1 return")
    void t3() {
        assertThat(new Solution().solution(123456, 7)).isEqualTo(-1);
    }
}