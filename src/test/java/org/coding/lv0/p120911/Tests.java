package org.coding.lv0.p120911;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {
    @Test
    @DisplayName("Bcad -> abcd, 모든 알파벳을 소문자로 바꾸고 알파벳순으로 정렬")
    void t1() {
        Assertions.assertThat(new Solution().solution("Bcad")).isEqualTo("abcd");
    }

    @Test
    @DisplayName("heLLo -> ehllo, 모든 알파벳을 소문자로 바꾸고 알파벳순으로 정렬")
    void t2() {
        Assertions.assertThat(new Solution().solution("heLLo")).isEqualTo("ehllo");
    }

    @Test
    @DisplayName("Python -> hnopty, 모든 알파벳을 소문자로 바꾸고 알파벳순으로 정렬")
    void t3() {
        Assertions.assertThat(new Solution().solution("Python")).isEqualTo("hnopty");
    }
}