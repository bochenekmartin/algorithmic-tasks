package com.algorithmic.utils;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 12/9/10
 */
public class LettersMagician {

    //works only for uppercase letters
    public int alphabeticalPosition(char letter) {
        return ((int) letter) - 64;
    }
}
