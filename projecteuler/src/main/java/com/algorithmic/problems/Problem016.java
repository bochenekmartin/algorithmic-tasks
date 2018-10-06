package com.algorithmic.problems;

import java.math.BigInteger;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: Oct 21, 2010
 */
public class Problem016 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("2");
        BigInteger result = a.pow(1000);
        String resultStr = result.toString();
        char[] chars = resultStr.toCharArray();
        int sum = 0;
        for (char aChar : chars) {
            sum += aChar - '0';
        }
        System.out.println("sum: " + sum);
    }
}
