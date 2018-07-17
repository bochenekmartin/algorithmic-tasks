package com.algorithmic.problems;

public class Problem001 {

    public static void main(String... args) {
        int sum = 0;
        for (int i = 3; i <= 999; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
