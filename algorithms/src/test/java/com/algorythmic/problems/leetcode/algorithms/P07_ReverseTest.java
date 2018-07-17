package com.algorythmic.problems.leetcode.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class P07_ReverseTest {

    final P07_Reverse underTest = new P07_Reverse();

    @Test
    public void reverse() throws Exception {
        /*
          assertAll("List is not incremental",
                () -> assertEquals(underTest.reverse(123), 321),
                () -> assertEquals(underTest.reverse(-123), -321),
                () -> assertEquals(underTest.reverse(1534236469), 0));
         */
        Assertions.assertThat(underTest.reverse(123)).isEqualTo(321);
        Assertions.assertThat(underTest.reverse(-123)).isEqualTo(-321);
        Assertions.assertThat(underTest.reverse(1534236469)).isEqualTo(0);
    }

}