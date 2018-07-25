package com.algorithmic.problems.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HackerRankInAStringTest {

    @Test
    void testIt() {
        assertThat(HackerRankInAString.doIt("hereiamstackerrank")).isEqualTo("YES");
        assertThat(HackerRankInAString.doIt("haacckkerrannkk ")).isEqualTo("YES");
        assertThat(HackerRankInAString.doIt("hackerworld")).isEqualTo("NO");
        assertThat(HackerRankInAString.doIt("haacckkerannk")).isEqualTo("NO");
    }
}