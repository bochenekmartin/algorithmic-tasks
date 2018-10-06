package com.algorithmic.problems;

import com.algorithmic.utils.NumbersMagician;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 11/24/10
 */
public class Problem004Test {

    @Test
    public void check() {
        assertTrue(new NumbersMagician().isPalindrome(101));
    }
}
