package com.algorithmic.problems;

public class Problem097 {

    public static void main(String[] args) {
        new Problem097().solve();
    }

    private void solve() {
        long number = lastDigitsOfTwoPow();
        number *= 28433;
        number++;

        System.out.println(shortToTenDigits(number));
    }

    long lastDigitsOfTwoPow() {
        long number = 2;
        int pow = 7830457;
        for (int i = 2; i <= pow; i++) {
            number *= 2;
            int firstTenDigitsNumber = 1000000000;
            if (number >= firstTenDigitsNumber) {
                number = shortToTenDigits(number);
            }
        }
        return number;
    }

    long shortToTenDigits(long number) {
        String s = Long.toString(number);
        return Long.parseLong(s.substring(s.length() - 10));
    }
}
