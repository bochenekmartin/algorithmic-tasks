package com.algorythmic.tasks.problems.hackerrank.strings;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


public class WeightedUniformStringsTest {

    WeightedUniformStrings underTest = new WeightedUniformStrings();

    @Test
    public void shouldReturnWeightsOfString() {
        //given
        String input = "abccddde";

        //when
        Set<Integer> result = underTest.calculateWeightsOf(input);

        //then
        assertThat(result).containsOnly(1, 2, 3, 6, 4, 8, 12, 5);
    }
}