package com.algorithmic.problems;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Problem097Test {

    @Test
    public void shortToTenDigits(){
        long before = 1234567890123L;
        long after = new Problem097().shortToTenDigits(before);
        assertEquals(4567890123L, after);
    }
}
