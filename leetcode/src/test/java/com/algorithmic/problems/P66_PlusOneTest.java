package com.algorithmic.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P66_PlusOneTest {

    P66_PlusOne test = new P66_PlusOne();

    @Test
    void plusOne() {
        assertThat(test.plusOne(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 4});
        assertThat(test.plusOne(new int[]{0})).isEqualTo(new int[]{1});
        assertThat(test.plusOne(new int[]{4, 3, 2, 1})).isEqualTo(new int[]{4, 3, 2, 2});
        assertThat(test.plusOne(new int[]{1, 9})).isEqualTo(new int[]{2, 0});
        assertThat(test.plusOne(new int[]{1, 9, 9, 9})).isEqualTo(new int[]{2, 0, 0, 0});
        assertThat(test.plusOne(new int[]{9})).isEqualTo(new int[]{1, 0});
    }
}