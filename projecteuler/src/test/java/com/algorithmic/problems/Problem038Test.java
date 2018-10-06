package com.algorithmic.problems;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 11/24/10
 */
public class Problem038Test {
    Problem038 underTest = new Problem038();

    @Test
    public void buildPandigialCandidate() {
        String result = underTest.buildPandigitalCandidate(192, new StringBuilder());
        Assert.assertEquals("192384576", result);
    }
}
