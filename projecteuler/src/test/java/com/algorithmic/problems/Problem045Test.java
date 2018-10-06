package com.algorithmic.problems;

import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.Assert.assertEquals;

public class Problem045Test {
    Problem045_ns underTest = new Problem045_ns();

    @Test
    public void findIdx() {
        BigInteger[] values = {new BigInteger("0"), new BigInteger("0"),new BigInteger("0")};
        int idxOfMin = underTest.findIdxOfMin(values);
        assertEquals(0, idxOfMin);

        BigInteger[] values1 = {new BigInteger("3"), new BigInteger("1"),new BigInteger("2")};
        int idxOfMin1 = underTest.findIdxOfMin(values1);
        assertEquals(1, idxOfMin1);

        BigInteger[] values2 = {new BigInteger("3"), new BigInteger("4"),new BigInteger("1")};
        int idxOfMin2 = underTest.findIdxOfMin(values2);
        assertEquals(2, idxOfMin2);
    }
}
