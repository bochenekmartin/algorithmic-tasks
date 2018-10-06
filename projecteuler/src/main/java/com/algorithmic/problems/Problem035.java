package com.algorithmic.problems;

import com.algorithmic.utils.NumbersMagician;

public class Problem035 {

    public static void main(String[] args) {
        new Problem035().solve();
    }

    private void solve() {
        NumbersMagician magician = new NumbersMagician();
        int result = 0;
        int million = 1000000;
        long time = System.nanoTime();
        for (int i = 2; i < million; i++) {
            if (magician.isCircular(i)) {
                result++;
            }
        }
        long time_2 = System.nanoTime();

        System.out.println((time_2 - time) / 1000000 + " mili sec");
        System.out.println(result);
    }
}
