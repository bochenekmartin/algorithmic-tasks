package com.algorithmic.problems;

import java.math.BigInteger;

public class Problem048 {
    public static void main(String[] args) {
        new Problem048().solve();
    }

    private void solve() {
        BigInteger result = BigInteger.ONE;
        BigInteger temp;
        for (long i = 2; i <= 1000; i++) {
            temp = BigInteger.valueOf(i);
            result = result.add(temp.pow(Integer.valueOf(Long.toString(i))));
        }
        String resultStr = result.toString();
        String lastTenDigits = resultStr.substring(resultStr.length() - 10);
        System.out.println(lastTenDigits);
    }
}
