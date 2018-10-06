package com.algorithmic.problems;

import java.math.BigInteger;

public class Problem025 {
    public static void main(String[] args) {
        new Problem025().solve();
    }

    private void solve() {
        BigInteger n1 = BigInteger.ONE;
        BigInteger n2 = BigInteger.ONE;

        int numberOfTerm = 2;
        BigInteger next = BigInteger.ZERO;

        while (next.toString().length() < 1000) {
            numberOfTerm++;
            next = n1.add(n2);
            n2 = n1;
            n1 = next;
        }

        System.out.println(numberOfTerm);
    }
}
