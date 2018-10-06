package com.algorithmic.problems;

import com.algorithmic.utils.MaxPrimeFactorFinder;
import com.algorithmic.utils.NumbersMagician;

public class Problem003 {
    public static void main(String[] args) {
        new Problem003().solve();
    }

    private void solve() {
        long given = 600851475143L;
        MaxPrimeFactorFinder finder = new MaxPrimeFactorFinder();

        Long maxPrime = finder.find(given);
        System.out.println(maxPrime);
    }
}
