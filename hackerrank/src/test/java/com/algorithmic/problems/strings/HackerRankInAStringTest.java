package com.algorithmic.problems.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HackerRankInAStringTest {

    @Test
    public void name() throws Exception {
        Assertions.assertThat(HackerRankInAString.doIt("hereiamstackerrank")).isEqualTo("YES");
        Assertions.assertThat(HackerRankInAString.doIt("haacckkerrannkk ")).isEqualTo("YES");
        Assertions.assertThat(HackerRankInAString.doIt("hackerworld")).isEqualTo("NO");
        Assertions.assertThat(HackerRankInAString.doIt("haacckkerannk")).isEqualTo("NO");
    }
}