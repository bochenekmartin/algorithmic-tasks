package com.algorithmic.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P152_MaximumProductSubarrayTest {

    P152_MaximumProductSubarray test = new P152_MaximumProductSubarray();

    @Test
    void maxProduct1() {
        int result = test.maxProduct(new int[]{2, 3, -2, 4});
        assertEquals(6, result);
    }

    @Test
    void maxProduct2() {
        int result = test.maxProduct(new int[]{-2, 0, -1});
        assertEquals(0, result);
    }

    @Test
    void maxProduct3() {
        int result = test.maxProduct(new int[]{-2});
        assertEquals(-2, result);
    }

    @Test
    void maxProduct4() {
        int result = test.maxProduct(new int[]{-2, 3, -4});
        assertEquals(24, result);
    }

    @Test
    void maxProduct5() {
        int result = test.maxProduct(new int[]{-3, 2, -5, 4});
        assertEquals(120, result);
    }
}