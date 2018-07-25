package com.algorithmic.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class P007_ReverseTest {

    final P007_Reverse underTest = new P007_Reverse();

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