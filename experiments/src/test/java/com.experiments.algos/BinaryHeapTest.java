package com.experiments.algos;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryHeapTest {

    BinaryHeap test = new BinaryHeap();

    @Test
    void shouldReturnTop100() {
        //given
        int n = 3000;
        List<Integer> input = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
             input.add(i);
        }
        Collections.shuffle(input);

        //when
        List<Integer> result = test.getTop100Numbers(input);

        //then
        assertThat(result).hasSize(100);

        for (int i = 0; i < result.size(); i++) {
            Integer integer =  result.get(i);
            int expected = n - result.size() + i + 1;
            assertThat(integer).isEqualTo(expected);
        }

    }
}