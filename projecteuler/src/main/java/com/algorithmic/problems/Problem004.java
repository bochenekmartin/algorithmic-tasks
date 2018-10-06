package com.algorithmic.problems;

import com.algorithmic.utils.NumbersMagician;

public class Problem004 {
    public static void main(String[] args) {
        int result = 0;
        NumbersMagician magician = new NumbersMagician();
        for (int a = 999; a >= 100; a--) {
            for (int b = 999; b >= 100; b--) {
                int current = a * b;
                
                if (magician.isPalindrome(current) && result < current) {
                    result = current;
                }
            }
        }
        System.out.println(result);
    }
}
