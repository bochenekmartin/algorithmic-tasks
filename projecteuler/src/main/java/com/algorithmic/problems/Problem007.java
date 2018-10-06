package com.algorithmic.problems;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: Oct 21, 2010
 */

import com.google.common.base.Stopwatch;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class Problem007 {

    public static void main(String[] args) {
        long current = 2;
        int lp = 1;
        Stopwatch stopwatch = Stopwatch.createStarted();
        while (lp <= 10001) {
            BigInteger number = new BigInteger(current + "");
            if (number.isProbablePrime(3)) {
                lp++;
            }
            current++;
        }
        --current;
        System.out.println(current);
        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS) + " ms");
    }
}
