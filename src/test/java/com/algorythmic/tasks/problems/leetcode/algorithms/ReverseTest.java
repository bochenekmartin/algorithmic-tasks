package com.algorythmic.tasks.problems.leetcode.algorithms;

import org.junit.jupiter.api.Assertions;
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
        assertThat(new Reverse().reverse(123)).isEqualTo(321);
        assertThat(new Reverse().reverse(-123)).isEqualTo(-321);
        assertThat(new Reverse().reverse(1534236469)).isEqualTo(0);
    }

}