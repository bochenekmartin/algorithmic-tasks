package com.algorithmic.problems;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: Oct 21, 2010
 */
public class Problem012 {
    public static void main(String[] args) {
        new Problem012().solve();
    }

    private void solve() {
        Stopwatch stopwatch = Stopwatch.createStarted();

        for (int i = 5000; ; i++) {
            int candidate = ((i * i) + i) / 2;
            int amt = amountOfDivisors(candidate);

            if (amt > 300) {
                System.out.println(stopwatch.elapsed(TimeUnit.SECONDS) + " seconds");

                System.out.println(candidate + " " + amt);
                if (amt > 500) {
                    return;
                }
            }
        }
    }

    int amountOfDivisors(int number) {
        if (number % 30 != 0) {
            return 1;
        }

        int result = 7;

        int limit = (number / 2);

        for (int i = 7; i <= limit; i++) {
            if (number % i == 0) {
                result++;
            }
        }
        return result;
    }
}
