package com.algorithmic.problems;

import com.algorithmic.utils.NumbersMagician;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 11/24/10
 */
public class Problem038 {

    NumbersMagician magician = new NumbersMagician();

    public static void main(String[] args) {
        new Problem038().solve();
    }

    private void solve() {
        int max = 0;
        StringBuilder pandigitalsBuilder = new StringBuilder();

        for (int i = 1; i < 9999; i++) {
            String candidate = buildPandigitalCandidate(i, pandigitalsBuilder);
            if (magician.isPandigital(candidate) && Integer.parseInt(candidate) > max) {
                max = Integer.parseInt(candidate);
            }
        }
        System.out.println(max);
    }

    public String buildPandigitalCandidate(
            int candidate,
            StringBuilder pandigitalsBuilder) {
        pandigitalsBuilder.delete(0, pandigitalsBuilder.length());

        int counter = 1;
        while (pandigitalsBuilder.length() < 9) {
            int tempProduct = counter * candidate;
            pandigitalsBuilder.append(Integer.toString(tempProduct));
            counter++;
        }
        return pandigitalsBuilder.toString();
    }


}
