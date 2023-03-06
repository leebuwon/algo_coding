package org.coding.lv0.p120585;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("머쓱이보다 키큰 사람이 3명 있습니다.")
    void t1() {
        int[] arr = {149, 180, 192, 170};
        int height = 167;
        assertThat(new Solution().solution(arr, height)).isEqualTo(3);
    }

    @Test
    @DisplayName("머쓱이보다 키큰 사람이 0명 있습니다.")
    void t2() {
        int[] arr = {180, 120, 140};
        int height = 190;
        assertThat(new Solution().solution(arr, height)).isEqualTo(0);
    }

}