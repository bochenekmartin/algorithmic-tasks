package com.algorithmic.utils;

import java.math.BigInteger;

public class NumbersCreator {

    BigInteger TWO = new BigInteger("2");
    BigInteger THREE = new BigInteger("3");

    public BigInteger triangleNumber(long n) {
        long inc = n + 1;
        BigInteger mulN = new BigInteger(Long.toString(inc)).multiply(new BigInteger(Long.toString(n)));
        return mulN.divide(TWO);
    }

    public BigInteger pentagonalNumber(long n) {
        BigInteger bigInteger = new BigInteger(Long.toString(n));
        BigInteger multiply = bigInteger.multiply(THREE);
        BigInteger subtract = multiply.subtract(BigInteger.ONE);
        BigInteger multiply1 = subtract.multiply(bigInteger);
        return multiply1.divide(TWO);
//        return n * (3 * n - 1) / 2;
    }


    public BigInteger hexagonalNumber(long n) {
        BigInteger bigInteger = new BigInteger(Long.toString(n));
        BigInteger multiply = bigInteger.multiply(TWO);
        BigInteger subtract = multiply.subtract(BigInteger.ONE);
        return subtract.multiply(bigInteger);
//        return n * (2 * n - 1);
    }
}
