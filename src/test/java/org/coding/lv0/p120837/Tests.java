package org.coding.lv0.p120837;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("hp = 23이라면 result = 5")
    void t1(){
        assertThat(new Solution().solution(23)).isEqualTo(5);
    }

    @Test
    @DisplayName("hp = 24라면 result = 6")
    void t2(){
        assertThat(new Solution().solution(24)).isEqualTo(6);
    }


    @Test
    @DisplayName("hp = 999라면 result = 201")
    void t3(){
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }

}