package com.algorithmic.problems;

import com.google.common.collect.Lists;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class P001_TwoSumTest {

    @Test
    void twoSum() throws Exception {
        //given
        List<Integer> input = Lists.newArrayList(2, 7, 11, 15);

        //when
        int[] result = new P001_TwoSum().twoSum(input, 9);

        //then
        Assertions.assertThat(result[0]).isEqualTo(0);
        Assertions.assertThat(result[1]).isEqualTo(1);
    }

}