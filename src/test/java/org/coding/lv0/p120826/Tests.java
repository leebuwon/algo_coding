package org.coding.lv0.p120826;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("myString = abcdef / letter = f -> abcde")
    void t1() {
        String myString = "abcdef";
        String letter = "f";
        assertThat(new Solution().solution(myString, letter)).isEqualTo("abcde");
    }

    @Test
    @DisplayName("myString = BCBdbe / letter = B -> Cdbe")
    void t2() {
        String myString = "BCBdbe";
        String letter = "B";
        assertThat(new Solution().solution(myString, letter)).isEqualTo("Cdbe");
    }

}