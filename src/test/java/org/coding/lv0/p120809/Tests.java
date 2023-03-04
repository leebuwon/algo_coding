package org.coding.lv0.p120809;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Tests {

    @Test
    @DisplayName("배열에 X2를 성공적으로 한다.")
    void t1(){
        int[] n = {20, 30, 40};
        int[] solution = {40, 60, 80};
        assertThat(new org.coding.lv0.p120809.Solution().solution(n)).isEqualTo(solution);
    }
}