package com.algorythmic.tasks.hackerrank;

import org.assertj.core.api.Assertions;

public class CommonChildTest {

    @org.junit.Test
    public void commonChild() throws Exception {
        Assertions.assertThat(CommonChild.commonChild("SHINCHAN", "NOHARAAA")).isEqualTo(3);
        Assertions.assertThat(CommonChild.commonChild("ABCDEF", "FBDAMN")).isEqualTo(2);
        Assertions.assertThat(CommonChild.commonChild("HARRY", "SALLY")).isEqualTo(2);
        Assertions.assertThat(CommonChild.commonChild("AA", "BB")).isEqualTo(0);
    }

}