package com.algorithmic.problems;

import java.math.BigInteger;

public class Problem020 {
    public static void main(String[] args) {
        new Problem020().solve();
    }

    private static final int LIMIT = 100;
    private static final BigInteger[] factorials = new BigInteger[LIMIT];

    private void solve() {
        factorials[2] = new BigInteger("2");
        for (int i = 3; i < LIMIT; i++) {

            if (factorials[i - 1].mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
                factorials[i - 1] = factorials[i - 1].divide(BigInteger.TEN);
            }
            factorials[i] = factorials[i - 1].multiply(new BigInteger(Integer.toString(i)));
        }

        char[] digits = factorials[LIMIT - 1].toString().toCharArray();
        int result = 0;
        for (char digit : digits) {
            result += Character.getNumericValue(digit);
        }
        System.out.println(result);
    }
}
