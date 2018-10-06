package com.algorithmic.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ags on 11/8/10 at 6:29 PM
 */
public class Problem021 {

    public static void main(String[] args) {
        new Problem021().solve();
    }

    private void solve() {

        Set<Integer> amicables = new HashSet<Integer>();

        for (int i = 1; i < 10000; i++) {
            amicables.addAll(getAmicables(i));
        }

        int result = 0;
        for (Integer amicable : amicables) {
            result += amicable;
        }
        System.out.println(result);
    }

    Collection<Integer> getAmicables(int i) {
        int i2 = getSumOfDivisorsSmallerThan(i);
        int i3 = getSumOfDivisorsSmallerThan(i2);
        if (i2 == 0 || i != i3 || selfAmicability(i, i2)) {
            return Collections.emptyList();
        }

        System.out.println(i + " " + i2);
        return Arrays.asList(i, i2);
    }

    private boolean selfAmicability(int i, int i2) {
        return i == i2;
    }

    int getSumOfDivisorsSmallerThan(int i) {
        List<Integer> divisors = getDivisorsSmallerThan(i);
        int sum = 0;
        for (Integer primeFactor : divisors) {
            sum += primeFactor;
        }

        return sum;
    }

    List<Integer> getDivisorsSmallerThan(int i) {
        List<Integer> divisors = new ArrayList<Integer>();

        int stop = i / 2 + 1;
        for (int j = 1; j < stop; j++) {
            if (i % j == 0) {
                divisors.add(j);
            }
        }

        return divisors;
    }
}