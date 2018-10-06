package com.algorithmic.utils;

import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 11/24/10
 */
public class NumbersMagicianTest {

    NumbersMagician underTest = new NumbersMagician();

    @Test
    public void isCurious() {
        assertTrue(underTest.isCurious(145));
        assertFalse(underTest.isCurious(146));
    }

    @Test
    public void asDigit() {
        assertEquals(9, underTest.asDigit('9'));
        assertEquals(0, underTest.asDigit('0'));
    }

    @Test
    public void isPandigital() {
        assertTrue(underTest.isPandigital("192384576"));
        assertTrue(underTest.isPandigital("918273645"));
        assertFalse(underTest.isPandigital("91827364"));
        assertFalse(underTest.isPandigital("91827366"));
        assertFalse(underTest.isPandigital("91827360"));
    }

    @Test
    public void isLychrel() {
        assertFalse(underTest.isLychrel(191));
        assertFalse(underTest.isLychrel(349));
        assertTrue(underTest.isLychrel(196));
        assertFalse(underTest.isLychrel(47));
        assertTrue(underTest.isLychrel(1947));
        assertTrue(underTest.isLychrel(4994));
    }

    @Test
    public void reverseAndMultiply() {
        assertEquals(new BigInteger("1292"), underTest.reverseAndAdd(new BigInteger("349")));
        assertEquals(new BigInteger("7337"), underTest.reverseAndAdd(new BigInteger("4213")));
    }

    @Test
    public void isPalindrome() {
        assertTrue(underTest.isPalindrome(1991));
        assertFalse(underTest.isPalindrome(1992));
    }

    @Test
    public void charToInt() {
        assertEquals(3, underTest.asInt('3'));
    }

    @Test
    public void isCircular() {
        assertTrue(underTest.isCircular(197));
        assertTrue(underTest.isCircular(3));
        assertFalse(underTest.isCircular(198));
        assertFalse(underTest.isCircular(102));
    }

    @Test
    public void isPrime() {
        assertFalse(underTest.isPrime(102));
    }

    @Test
    public void nextInCircle() {
        int result = underTest.nextInCircle(197);
        assertEquals(971, result);
    }

    @Test
    public void areEqual() {
        assertTrue(underTest.areEqual(new BigInteger("45"), new BigInteger("45"), new BigInteger("45")));
        assertFalse(underTest.areEqual(new BigInteger("45"), new BigInteger("45"), new BigInteger("44")));
    }
}
