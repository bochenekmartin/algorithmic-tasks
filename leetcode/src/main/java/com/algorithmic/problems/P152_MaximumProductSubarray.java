package com.algorithmic.problems;

public class P152_MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int maxFromSub = findSub(nums, i);
            max = Math.max(max, maxFromSub);
        }
        return max;
    }

    private int findSub(int[] nums, int i) {
        int max = nums[0];
        int cumulative = 1;
        for (int j = i; j < nums.length; j++) {
            int num = nums[j];
            cumulative = cumulative * num;
            max = Math.max(max, cumulative);
        }

        return max;
    }

}
