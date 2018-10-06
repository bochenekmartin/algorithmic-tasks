package com.algorithmic.utils;

import java.math.BigInteger;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 11/24/10
 */
public class NumbersMagician {

    private int[] factorialsOfDigits = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    private StringBuilder stringBuilder = new StringBuilder();

    public boolean isCurious(int candidate) {
        char[] chars = Integer.toString(candidate).toCharArray();
        int[] digits = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            digits[i] = asDigit(chars[i]);
        }

        int sumOfFactorials = 0;
        for (int digit : digits) {
            sumOfFactorials += factorialsOfDigits[digit];
        }

        return candidate == sumOfFactorials;
    }

    public int asDigit(char ch) {
        return ((int) ch) - 48;
    }

    //works for candidates below 10000
    public boolean isLychrel(int candidate) {
        BigInteger current = new BigInteger(Integer.toString(candidate));

        for (int i = 0; i < 50; i++) {
            current = reverseAndAdd(current);
            if (isPalindrome(current.toString())) {
                return false;
            }
        }
        return true;
    }

    BigInteger reverseAndAdd(BigInteger current) {
        clearStringBuilder();
        new BigInteger("55");
        stringBuilder.append(current.toString());
        String reversed = stringBuilder.reverse().toString();
        BigInteger val = new BigInteger(reversed);
        return current.add(val);
    }

    public boolean isPalindrome(int current) {
        String currentStr = Integer.toString(current);
        return isPalindrome(currentStr);
    }

    public boolean isPalindrome(String currentStr) {
        clearStringBuilder();
        stringBuilder.append(currentStr);
        return currentStr.equals(stringBuilder.reverse().toString());
    }

    private void clearStringBuilder() {
        stringBuilder.delete(0, stringBuilder.length());
    }

    public boolean isPrime(int candidate) {
        return new BigInteger(Integer.toString(candidate)).isProbablePrime(50);
    }

    public boolean isPandigital(String candidate) {
        if (candidate.length() != 9) {
            return false;
        }

        boolean[] digits = new boolean[10];
        for (int i = 0; i < candidate.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(candidate.charAt(i)));
            digits[digit] = true;
        }

        int amountOfDifferentDigits = 0;
        for (int i = 1; i < digits.length; i++) {
            if (digits[i]) {
                amountOfDifferentDigits++;
            }
        }
        return amountOfDifferentDigits == 9;
    }

    public int asInt(char ch) {
        return (int) ch - 48;
    }

    public boolean isCircular(int candidate) {
        if (!isPrime(candidate)) {
            return false;
        }
        if (candidate < 10) {
            return true;
        }
        String candidateStr = Integer.toString(candidate);
        if (candidateStr.contains("0")) {
            return false;
        }
        int attempts = candidateStr.length();
        int next = candidate;

        for (int i = 1; i < attempts; i++) {
            next = nextInCircle(next);
            if (!isPrime(next)) {
                return false;
            }
        }
        return true;
    }

    int nextInCircle(int previous) {
        clearStringBuilder();
        String asString = Integer.toString(previous);
        stringBuilder.append(asString.substring(1)).append(asString.charAt(0));
        return Integer.parseInt(stringBuilder.toString());
    }

    public boolean areEqual(BigInteger a, BigInteger b, BigInteger c) {
        return a.equals(b) && b.equals(c);
    }
}
