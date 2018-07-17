package com.algorythmic.problems.leetcode.algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class P179_LargestNumber {

    public String largestNumber(int[] nums) {
        String result = Arrays.stream(nums)
                .mapToObj(Integer::toString)
                .sorted((o1, o2) -> {
                    String concat12 = o1.concat(o2);
                    String concat21 = o2.concat(o1);
                    return concat21.compareTo(concat12);
                })
                .collect(Collectors.joining(""));
        if (result.charAt(0) == '0') {
            return "0";
        } else {
            return result;
        }
    }
}
