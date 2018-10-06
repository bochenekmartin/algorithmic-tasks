package com.algorithmic.problems;

public class Problem010 {
    public static void main(String[] args) {
        new Problem010().solve();
    }

    private void solve() {
        int n = 2000000;
        // Eratostenes sieve
        boolean[] numbersTable = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!numbersTable[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    numbersTable[j] = true;
                }
            }
        }

        long result = 0;
        for (int i = 2; i <= n; i++) {
            if (!numbersTable[i]) {
                result += i;
            }
        }
        System.out.println(result);
    }
}

