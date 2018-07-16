package com.algorythmic.problems.leetcode.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

    final Reverse underTest = new Reverse();

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