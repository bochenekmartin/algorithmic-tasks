package com.algorithmic.utils;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class NumbersCreatorTest {
    NumbersCreator underTest = new NumbersCreator();

    @Test
    public void triangle() {
        assertEquals(new BigInteger("6"), underTest.triangleNumber(3));
        assertEquals(new BigInteger("15"), underTest.triangleNumber(5));
        assertEquals(new BigInteger("40755"), underTest.triangleNumber(285));
    }

    @Test
    public void pentagonal() {
        assertEquals(new BigInteger("12"), underTest.pentagonalNumber(3));
        assertEquals(new BigInteger("35"), underTest.pentagonalNumber(5));
        assertEquals(new BigInteger("40755"), underTest.pentagonalNumber(165));
    }

    @Test
    public void hexagonal() {
        assertEquals(new BigInteger("15"), underTest.hexagonalNumber(3));
        assertEquals(new BigInteger("45"), underTest.hexagonalNumber(5));
        assertEquals(new BigInteger("40755"), underTest.hexagonalNumber(143));
    }
}
