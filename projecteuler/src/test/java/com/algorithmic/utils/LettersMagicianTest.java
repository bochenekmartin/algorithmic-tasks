package com.algorithmic.utils;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 12/9/10
 */
public class LettersMagicianTest {

    LettersMagician underTest = new LettersMagician();

    @Test
    public void testAlphabeticalPosition() {
        assertEquals(19, underTest.alphabeticalPosition('S'));
        assertEquals(11, underTest.alphabeticalPosition('K'));
        assertEquals(25, underTest.alphabeticalPosition('Y'));
        assertEquals(1, underTest.alphabeticalPosition('A'));
    }
}
