package com.algorythmic.tasks.leetcode.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum() throws Exception {

        int[] input = {2, 7, 11, 15};

        int[] result = new TwoSum().twoSum(input, 9);

        Assertions.assertThat(result[0]).isEqualTo(0);
        Assertions.assertThat(result[1]).isEqualTo(1);
    }

}