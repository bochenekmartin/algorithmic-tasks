package com.algorithmic.problems;

public class Problem006 {
    public static void main(String[] args) {
        new Problem006().solve();
    }

    private void solve() {
        int sumOfSquares = sumOfSquares(100);
        int squareOfSum = squareOfSum(100);
        System.out.println(sumOfSquares);
        System.out.println(squareOfSum);
        System.out.println(squareOfSum - sumOfSquares);
    }

    private int squareOfSum(int to) {
        int result = 0;
        for (int i = 1; i <= to; i++) {
            result += i;
        }
        return result * result;
    }

    private int sumOfSquares(int to) {
        int result = 0;
        for (int i = 1; i <= to; i++) {
            result += Math.pow(i, 2);
        }
        return result;
    }
}
