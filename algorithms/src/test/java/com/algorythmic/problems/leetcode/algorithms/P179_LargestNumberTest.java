package com.algorythmic.problems.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P179_LargestNumberTest {

    @Test
    void largestNumber() {
        P179_LargestNumber test = new P179_LargestNumber();
        assertEquals("210", test.largestNumber(new int[]{10, 2}));
        assertEquals("9534330", test.largestNumber(new int[]{3, 30, 34, 5, 9}));
        assertEquals("0", test.largestNumber(new int[]{0, 0, 0}));
    }
}