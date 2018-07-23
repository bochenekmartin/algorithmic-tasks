package com.algorithmic.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P03_LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring() {
        P03_LongestSubstringWithoutRepeatingCharacters underTest = new P03_LongestSubstringWithoutRepeatingCharacters();
        assertEquals(1, underTest.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, underTest.lengthOfLongestSubstring("pwwkew"));
        assertEquals(3, underTest.lengthOfLongestSubstring("abcabcbb"));

    }
}