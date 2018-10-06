package com.algorithmic.problems;

import com.google.common.annotations.VisibleForTesting;

import java.util.Date;

public class Problem019 {

    public static void main(String[] args) {
        System.out.println(new Problem019().solve());
    }

    @VisibleForTesting
    int solve() {
        int sundays = 0;
        for (int year = 1; year <= 100; year++) {
            for (int month = 0; month < 12; month++) {
                Date date = new Date(year, month, 1);
                System.out.println(date);
                if (date.getDay() == 0) {
                    sundays++;
                }
            }
        }
        return sundays;
    }
}