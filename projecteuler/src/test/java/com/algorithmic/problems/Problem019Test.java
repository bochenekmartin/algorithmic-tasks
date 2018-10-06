package com.algorithmic.problems;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 5/9/12
 * Time: 7:22 AM
 */
public class Problem019Test {

    @Test
    public void testSolve() {
        assertThat(new Problem019().solve()).isEqualTo(171);
    }
}
