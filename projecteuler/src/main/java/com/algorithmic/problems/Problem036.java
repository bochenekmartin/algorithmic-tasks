package com.algorithmic.problems;

import com.algorithmic.utils.NumbersMagician;

public class Problem036 {
    NumbersMagician magician = new NumbersMagician();
    final int limit = 1000000;

    public static void main(String[] args) {
        new Problem036().solve();
    }

    private void solve() {
        int total = 0;
        for (int i = 1; i < limit; i++) {
            if (magician.isPalindrome(i)) {
                String binaryString = Integer.toBinaryString(i);
                if (magician.isPalindrome(binaryString)) {
                    total += i;
                }
            }
        }
        System.out.println(total);
    }
}
