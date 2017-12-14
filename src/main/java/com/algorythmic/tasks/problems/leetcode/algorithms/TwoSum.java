package com.algorythmic.tasks.problems.leetcode.algorithms;

//1

import java.util.List;

public class TwoSum {

    public int[] twoSum(List<Integer> numsArg, int target) {
        Integer[] ints = new Integer[numsArg.size()];
        Integer[] nums = numsArg.toArray(ints);
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
