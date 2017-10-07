package com.algorythmic.tasks.problems.leetcode.algorithms;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseTest {

    @Test
    public void reverse() throws Exception {
        assertThat(new Reverse().reverse(123)).isEqualTo(321);
        assertThat(new Reverse().reverse(-123)).isEqualTo(-321);
        assertThat(new Reverse().reverse(1534236469)).isEqualTo(0);
    }

}