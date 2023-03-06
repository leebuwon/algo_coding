package org.coding.lv0.p120841;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("dot = {3, 2} -> 1")
    void t1(){
        int[] arr = {3, 2};
        assertThat(new Solution().solution(arr)).isEqualTo(1);
    }

    @Test
    @DisplayName("dot = {-3, 2} -> 2")
    void t2(){
        int[] arr = {-3, 2};
        assertThat(new Solution().solution(arr)).isEqualTo(2);
    }

    @Test
    @DisplayName("dot = {-3, -2} -> 3")
    void t3(){
        int[] arr = {-3, -2};
        assertThat(new Solution().solution(arr)).isEqualTo(3);
    }

    @Test
    @DisplayName("dot = {3, -2} -> 4")
    void t4(){
        int[] arr = {3, -2};
        assertThat(new Solution().solution(arr)).isEqualTo(4);
    }


}