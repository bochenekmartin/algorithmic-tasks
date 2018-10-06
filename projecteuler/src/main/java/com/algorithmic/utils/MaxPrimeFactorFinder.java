package com.algorithmic.utils;

import java.util.ArrayList;
import java.util.List;

public class MaxPrimeFactorFinder {
    public Long find(long given) {
        List<Long> numbers = findPrimeFactors(given);
//        long max = 0L;
//        for (Long number : numbers) {
//            if (number > max) {
//                max = number;
//            }
//        }
        return numbers.get(numbers.size() - 1);
//        return max;
    }

    private List<Long> findPrimeFactors(long number) { //find issue!
        List<Long> primeFactors = new ArrayList<Long>();
        long p = 2L;
        double g = Math.sqrt(number);
        while (p <= g) {
            while (number % p == 0) {
                number /= p;
                primeFactors.add(p);
            }
            if (number > 1) {
                p++;
            } else {
                break;
            }
            primeFactors.add(number);
        }
        return primeFactors;
    }
}
