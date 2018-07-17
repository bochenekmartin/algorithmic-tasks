package com.algorithmic.problems;

import java.util.Arrays;

public class P34_FindFirstandLastPositionofElementinSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        if (i < 0) {
            return new int[]{-1, -1};
        } else {
            int j = i;
            int[] result = {i, i};
            while (true) {
                i--;
                if (i >= 0 && nums[i] == target) {
                    result[0] = i;
                } else {
                    break;
                }
            }
            while (true) {
                j++;
                if (j < nums.length && nums[j] == target) {
                    result[1] = j;
                } else {
                    break;
                }
            }
            return result;
        }
    }
}
