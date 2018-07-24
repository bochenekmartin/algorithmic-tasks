package com.algorithmic.problems;

public class P66_PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        if (!allNines(digits)) {
            for (int i = digits.length - 1; i > 0; i--) {
                int digit = digits[i];
                if (digit == 9) {
                    digits[i] = 0;
                }
                if (digits[i - 1] != 9) {
                    digits[i - 1]++;
                    break;
                }
            }
            return digits;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = 0;
        }
        return result;
    }

    private boolean allNines(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                return false;
            }
        }
        return true;
    }
}
