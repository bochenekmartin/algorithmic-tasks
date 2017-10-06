package com.algorythmic.tasks.hackerrank;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockValidString {

    static String isValid(String s) {
        // Complete this function
        Map<Character, Integer> calc = new HashMap<>(45);
        char[] chars = s.toCharArray();
        for (char theChar : chars) {
            calc.merge(theChar, 1, (a, b) -> a + b);
        }
        Collection<Integer> values = calc.values();
        int first = values.iterator().next();
        int diffs = 0;
        for (Integer value : values) {
            if (value != first) {
                diffs++;
            }
        }


        return diffs > 1 ? "NO" : "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
