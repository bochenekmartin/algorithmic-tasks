package com.algorithmic.problems;

public class Problem030_ns {
    public static void main(String[] args) {
        new Problem030_ns().solve();
    }

    long limit = 99999999L;       //340000000

    private void solve() {
        for (long candidate = 990000000L; true; candidate++) {
            if (candidate % 10000000 == 0) {
                System.out.println(candidate);
            }
            char[] digits = Long.toString(candidate).toCharArray();
            long total = 0;
            for (char digitChar : digits) {
                int digit = 48 - digitChar;
                total += pow(digit);
            }
            if (total == candidate) {
                System.out.println(candidate);
                break;
            }
        }
    }

    private long pow(int digit) {
        long result = 1;
        for (int i = 1; i <= 5; i++) {
            result *= digit;
        }
        return result;
    }
}
