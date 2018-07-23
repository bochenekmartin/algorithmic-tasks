package com.algorithmic.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P151_ReverseWordsinaStringTest {

    @Test
    void reverseWords() {
        String result = new P151_ReverseWordsinaString().reverseWords("the sky is blue");
        assertEquals("blue is sky the", result);
    }

    @Test
    void reverseWordsMultipleSpaces() {
        String result = new P151_ReverseWordsinaString().reverseWords("     the      sky   is   blue  ");
        assertEquals("blue is sky the", result);
    }

    @Test
    void reverseWordsOneWord() {
        String result = new P151_ReverseWordsinaString().reverseWords("OliviaStar");
        assertEquals("OliviaStar", result);
    }

    @Test
    void reverseWordsOnlySpaces() {
        String result = new P151_ReverseWordsinaString().reverseWords(" ");
        assertEquals("", result);
    }
}