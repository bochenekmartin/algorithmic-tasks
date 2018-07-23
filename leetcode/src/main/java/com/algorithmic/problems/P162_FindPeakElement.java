package com.algorithmic.problems;

public class P162_FindPeakElement {

    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int num0 = Integer.MIN_VALUE;
            int num1 = Integer.MIN_VALUE;
            if (i > 0) {
                num0 = nums[i - 1];
            }
            if (i < nums.length - 1) {
                num1 = nums[i + 1];
            }
            if (num > num0 && num > num1) {
                return i;
            }
        }
        return 0;
    }
}
