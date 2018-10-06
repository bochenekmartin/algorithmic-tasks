package com.algorithmic.problems;

import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: Nov 15, 2010
 */
public class Problem029 {
    public static void main(String[] args) {
        new Problem029().solve();
    }

    private static final int LEFT_LIMIT = 2;
    private static final int RIGHT_LIMIT = 100;
    private Set<BigInteger> results = new TreeSet<BigInteger>();

    private void solve() {
        BigInteger result;
        for (int number = LEFT_LIMIT; number <= RIGHT_LIMIT; number++) {
            result = new BigInteger(Integer.toString(number));
            for (int power = LEFT_LIMIT; power <= RIGHT_LIMIT; power++) {
                results.add(result.pow(power));
            }
        }
        System.out.println("size: " + results.size());
    }
}
