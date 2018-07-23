package com.algorithmic.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P162_FindPeakElementTest {

    P162_FindPeakElement test = new P162_FindPeakElement();

    @Test
    void findPeakElement1() {
        int result = test.findPeakElement(new int[]{1, 2, 3, 1});
        assertEquals(2, result);
    }

    @Test
    void findPeakElement2() {
        int result = test.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        assertEquals(1, result);
    }
}