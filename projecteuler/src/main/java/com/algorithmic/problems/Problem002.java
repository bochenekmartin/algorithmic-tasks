package com.algorithmic.problems;

/**
 * Created by IntelliJ IDEA.
 * User: mbochene
 * Date: 2010-10-04
 * Time: 17:16:41
 */
public class Problem002 {
    public static void main(String[] args) {

        long sum = 0;

        int prev = 1;
        int current = 1;

        while (current < 4000000) {
            if (current % 2 == 0) {
                sum += current;
            }
            int newCurr = prev + current;
            prev = current;
            current = newCurr;
        }

        System.out.println(sum);
    }
}
