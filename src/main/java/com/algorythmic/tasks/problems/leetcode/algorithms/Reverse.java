package com.algorythmic.tasks.problems.leetcode.algorithms;

/*
 * Created by SG0212051 on 10/7/2017.
 */

//7

public class Reverse {

    public int reverse(int x) {
        String parsed = Integer.toString(x);
        if (x >= 0) {
            return reverse(parsed, 1);
        } else {
            return reverse(parsed.substring(1, parsed.length()), -1);
        }
    }

    private int reverse(String parsed, int multiply) {
        String reversed = new StringBuilder(parsed).reverse().toString();
        try {
            return Integer.parseInt(reversed) * multiply;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
