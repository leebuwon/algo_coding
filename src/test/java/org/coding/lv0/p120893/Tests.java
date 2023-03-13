package org.coding.lv0.p120893;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("cccCCC => CCCccc")
    void t1(){
        assertThat(new Solution().solution("cccCCC")).isEqualTo("CCCccc");
    }


    @Test
    @DisplayName("abCdEfghIJ => ABcDeFGHij")
    void t2(){
        assertThat(new Solution().solution("abCdEfghIJ")).isEqualTo("ABcDeFGHij");
    }
}