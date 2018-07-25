package com.algorithmic.problems.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CommonChildTest {

    @Test
    void commonChild() {
        assertThat(CommonChild.commonChild("SHINCHAN", "NOHARAAA")).isEqualTo(3);
        assertThat(CommonChild.commonChild("ABCDEF", "FBDAMN")).isEqualTo(2);
        assertThat(CommonChild.commonChild("HARRY", "SALLY")).isEqualTo(2);
        assertThat(CommonChild.commonChild("AA", "BB")).isEqualTo(0);
    }

}