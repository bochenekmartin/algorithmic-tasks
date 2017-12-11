package com.algorythmic.tasks.problems.hackerrank.strings;


import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WeightedUniformStrings {

    private static final String YES = "Yes";
    private static final String NO = "No";

    private static final Map<Character, Integer> WEIGHTS = new HashMap<>((int) ((float) 100 / 0.75F + 1.0F));

    static {
        for (int i = 0; i <= 25; i++) {
            //fill map with letters weights
            WEIGHTS.put((char) ('a' + i), i + 1);
        }
    }

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        String theString = in.next();
        int numberOfInputs = in.nextInt();
        WeightedUniformStrings it = new WeightedUniformStrings();
        Set<Integer> weights = it.calculateWeightsOf(theString);

        List<Integer> inputs = new ArrayList<>(numberOfInputs);
        for (int i = 0; i < numberOfInputs; i++) {
            inputs.add(in.nextInt());
        }

        for (Integer x : inputs) {
            if (weights.contains(x)) {
                System.out.println(YES);
            } else {
                System.out.println(NO);
            }
        }
    }

    Set<Integer> calculateWeightsOf(String theString) {
        Set<Integer> weights = new HashSet<>();

        char lastChar = '?';
        int numberOfCharPreviousOccurrences = 1;
        for (int i = 0; i < theString.length(); i++) {
            char c = theString.charAt(i);
            if (lastChar == c) {
                weights.add(calculateWeight(c, numberOfCharPreviousOccurrences + 1));
                numberOfCharPreviousOccurrences++;
            } else {
                numberOfCharPreviousOccurrences = 1;
                String repeat = String.valueOf(c);
                weights.add(calculateWeight(c, 1));
                lastChar = c;
            }
        }

        return weights;
    }

    private int calculateWeight(char c, int len) {
        return len * WEIGHTS.get(c);
    }

}
