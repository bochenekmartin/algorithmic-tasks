package com.algorithmic.problems;

/**
 * Created by IntelliJ IDEA.
 * User: mbochene
 * Date: 2010-10-12
 * Time: 17:54:06
 */
public class Problem009 {
    public static void main(String[] args) {
        new Problem009().solve();
    }

    private void solve() {
        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                for (int c = 1; c <= 1000; c++) {
                    if (a + b + c == 1000) {
                        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                            System.out.println("a: " + a + " b: " + b + " c: " + c);
                            System.out.println(a * b * c);
                            return;
                        }
                    }
                }
            }
        }
    }
}
