package com.algorithmic.problems.strings;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class WeightedUniformStringsTest {

    WeightedUniformStrings underTest = new WeightedUniformStrings();

    @Test
    void shouldReturnWeightsOfString() {
        //given
        String input = "abccddde";

        //when
        Set<Integer> result = underTest.calculateWeightsOf(input);

        //then
        assertThat(result).containsOnly(1, 2, 3, 6, 4, 8, 12, 5);
    }
}