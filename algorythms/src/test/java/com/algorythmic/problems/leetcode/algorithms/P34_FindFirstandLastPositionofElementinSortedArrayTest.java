package com.algorythmic.problems.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P34_FindFirstandLastPositionofElementinSortedArrayTest {

    @Test
    void searchRange() {
        P34_FindFirstandLastPositionofElementinSortedArray test = new P34_FindFirstandLastPositionofElementinSortedArray();
        int[] ints = test.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        assertEquals(ints[0], 3);
        assertEquals(ints[1], 4);

        ints = test.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        assertEquals(ints[0], -1);
        assertEquals(ints[1], -1);

        ints = test.searchRange(new int[]{1}, 6);
        assertEquals(ints[0], -1);
        assertEquals(ints[1], -1);

        ints = test.searchRange(new int[]{1}, 1);
        assertEquals(ints[0], 0);
        assertEquals(ints[1], 0);
    }
}