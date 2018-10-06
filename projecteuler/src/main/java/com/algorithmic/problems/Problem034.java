package com.algorithmic.problems;

import com.algorithmic.utils.NumbersMagician;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 12/3/10
 */
public class Problem034 {
    public static void main(String[] args) {
        new Problem034().solve();
    }

    NumbersMagician magician = new NumbersMagician();

    private void solve() {
        long sum = 0;
        for (int candidate = 3; candidate < 100000; candidate++) {
            if (magician.isCurious(candidate)) {
                sum += candidate;
            }
        }
        System.out.println(sum);
    }
}
