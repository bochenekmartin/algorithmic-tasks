package com.algorithmic.problems;

import com.algorithmic.utils.NumbersCreator;
import com.algorithmic.utils.NumbersMagician;

import java.math.BigInteger;
import java.util.Date;

public class Problem045_ns {
    public static void main(String[] args) throws Exception {
//        new Problem045_ns().solve();

    }

    NumbersMagician magician = new NumbersMagician();
    NumbersCreator creator = new NumbersCreator();

    private static final int T = 0;
    private static final int P = 1;
    private static final int H = 2;

    // T    P    H
    long[] n = {0, 0, 0};
    BigInteger[] values = {BigInteger.ZERO, BigInteger.ZERO, BigInteger.ZERO}; //   40755

    private void solve() {
        new Date();
        do {
            findMinAndCountNew();
            if (magician.areEqual(values[T], values[P], values[H])) {
                System.out.println(values[P]);
            }
            if (n[T] % 100 == 0)
//            if (values[T] <0) {
            {
                System.out.println(values[T]);
            }
//                throw new RuntimeException("trzeba zrobic biginteger");
//            }
        } while (true);

//        System.out.println(values[T]);
    }

    private void findMinAndCountNew() {
        int idxOfMin = findIdxOfMin(values);

        n[idxOfMin]++;
        switch (idxOfMin) {
            case T:
                values[idxOfMin] = creator.triangleNumber(n[T]);
                break;
            case P:
                values[idxOfMin] = creator.pentagonalNumber(n[P]);
                break;
            case H:
                values[idxOfMin] = creator.hexagonalNumber(n[H]);
                break;
        }
    }

    int findIdxOfMin(BigInteger[] values) {
        int idxOfMin = T;
//        BigInteger negateT = values[T].negate();
//        if (values[P] < values[T]) {
//        if (values[P].add(negateT).longValue() > 0) {     //substract
        if (values[T].subtract(values[P]).longValue() > 0) {     //substract
            idxOfMin = P;
        }

//        BigInteger negateP = values[P].negate();
//        if (values[H] < values[P]) {
        if (values[P].subtract(BigInteger.valueOf(H)).longValue() > 0) {
            idxOfMin = H;
        }
        return idxOfMin;
    }
}
