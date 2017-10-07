package com.algorythmic.tasks.problems.hackerrank.strings;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

public class CommonChildTest {

    @Ignore("not finished")
    @Test
    public void commonChild() throws Exception {
        Assertions.assertThat(CommonChild.commonChild("SHINCHAN", "NOHARAAA")).isEqualTo(3);
        Assertions.assertThat(CommonChild.commonChild("ABCDEF", "FBDAMN")).isEqualTo(2);
        Assertions.assertThat(CommonChild.commonChild("HARRY", "SALLY")).isEqualTo(2);
        Assertions.assertThat(CommonChild.commonChild("AA", "BB")).isEqualTo(0);
    }

}