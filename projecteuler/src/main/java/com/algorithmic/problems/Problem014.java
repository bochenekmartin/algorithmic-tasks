package com.algorithmic.problems;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 11/10/10
 */
public class Problem014 {
    public static void main(String[] args) {
        new Problem014().solve();
    }

    private final long LIMIT = 1000000;
    private long[] cache = new long[1000000];

    private void solve() {
        cache[1] = 1;
        long lengthForMax = 2;
        long max = 2;

        Stopwatch stopwatch = Stopwatch.createStarted();

        for (long i = 2; i < LIMIT; i++) {
            long length = chainLengthFor(i);
            if (length > lengthForMax) {
                lengthForMax = length;
                max = i;
            }
        }

        System.out.println(max + " / " + lengthForMax + " in: " + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "ms");
    }

    private long chainLengthFor(long i) {
        long chainLength = 2;
        long last = i;

        while (last != 2) {
            last = getNextInChain(last);

            if (last < LIMIT && cache[(int) last] > 0) {
                chainLength += cache[(int) last];
                return chainLength;
            }
            chainLength++;
        }

        return chainLength;
    }

    private long getNextInChain(long number) {
        if (number % 2 == 0) {
            return number / 2;
        } else {
            return 3 * number + 1;
        }
    }
}