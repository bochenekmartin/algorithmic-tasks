package com.algorithmic.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.algorithmic.utils.NumbersMagician;

public class Problem040 {

    public static final Logger log = LoggerFactory.getLogger(Problem040.class);

    public static void main(String[] args) {
        new Problem040().solve();
    }

    int[] digits = {1, 10, 100, 1000, 10000, 100000, 1000000};

    NumbersMagician magician = new NumbersMagician();

    private void solve() {
        StringBuilder builder = new StringBuilder();

        int i = 1;
        int lastDigitPlace = 1000000;
        while (builder.length() < lastDigitPlace) {
            builder.append(i);
            i++;
        }

        int result = 1;
        String fractionalPart = builder.toString();

        for (int place : digits) {
            int digit = magician.asInt(fractionalPart.charAt(place - 1));
            result *= digit;
            log.info(String.valueOf(digit));
        }
        log.info(String.valueOf(result));
    }
}
