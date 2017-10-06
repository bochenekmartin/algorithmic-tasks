package com.algorythmic.tasks.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by SG0212051 on 8/27/2017.
 */
public class HackerRankInAStringTest {


    @Test
    public void name() throws Exception {
        Assertions.assertThat(HackerRankInAString.doIt("hereiamstackerrank")).isEqualTo("YES");
        Assertions.assertThat(HackerRankInAString.doIt("haacckkerrannkk ")).isEqualTo("YES");
        Assertions.assertThat(HackerRankInAString.doIt("hackerworld")).isEqualTo("NO");
        Assertions.assertThat(HackerRankInAString.doIt("haacckkerannk")).isEqualTo("NO");
    }
}