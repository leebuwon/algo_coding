package org.coding.lv0.p120854;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("[We, are, the, world!] -> [2, 3, 3, 6]")
    void t1() {
        String[] strList = {"We", "are", "the", "world!"};
        int[] answer = {2, 3, 3, 6};
        assertThat(new Solution().solution(strList)).isEqualTo(answer);
    }

    @Test
    @DisplayName("[I, Love, Programmers.] -> [1, 4, 12]")
    void t2() {
        String[] strList = {"I", "Love", "Programmers."};
        int[] answer = {1, 4, 12};
        assertThat(new Solution().solution(strList)).isEqualTo(answer);
    }
}