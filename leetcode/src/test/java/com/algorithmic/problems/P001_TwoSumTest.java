package com.algorithmic.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class P001_TwoSumTest {

    @Test
    public void twoSum() throws Exception {
        //given
        List<Integer> input = List.of(2, 7, 11, 15);

        //when
        int[] result = new P001_TwoSum().twoSum(input, 9);

        //then
        Assertions.assertThat(result[0]).isEqualTo(0);
        Assertions.assertThat(result[1]).isEqualTo(1);
    }

}