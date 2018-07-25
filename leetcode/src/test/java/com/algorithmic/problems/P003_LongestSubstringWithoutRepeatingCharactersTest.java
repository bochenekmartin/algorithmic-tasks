package com.algorithmic.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P003_LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring() {
        P003_LongestSubstringWithoutRepeatingCharacters underTest = new P003_LongestSubstringWithoutRepeatingCharacters();
        assertEquals(1, underTest.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, underTest.lengthOfLongestSubstring("pwwkew"));
        assertEquals(3, underTest.lengthOfLongestSubstring("abcabcbb"));

    }
}