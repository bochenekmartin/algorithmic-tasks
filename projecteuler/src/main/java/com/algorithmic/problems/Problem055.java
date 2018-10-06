package com.algorithmic.problems;

import com.algorithmic.utils.NumbersMagician;

public class Problem055 {
    private final static int LIMIT = 10000;

    public static void main(String[] args) {
        new Problem055().solve();
    }

    NumbersMagician magician = new NumbersMagician();

    private void solve() {
        int amount = 0;
        int firstLychrelNumber = 196;
        for (int i = firstLychrelNumber; i < LIMIT; i++) {
            if (magician.isLychrel(i)) {
                amount++;
            }
        }
        System.out.println(amount);
    }
}
