package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

/**
 * <h3>1480. Running Sum of 1d Array</h3>
 *
 * <p>Given an array {@code nums}. We define a running sum of an array as
 * {@code runningSum[i] = sum(nums[0]…nums[i])}.</p>
 *
 * <p>Return the running sum of {@code nums}.</p>
 */

public class RunningSum1dArray {
    public static void main(String[] args) {
        // [1,3,6,10]
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
        // [1,2,3,4,5]
        System.out.println(Arrays.toString(runningSum(new int[]{1, 1, 1, 1, 1})));
        // [3,4,6,16,17]
        System.out.println(Arrays.toString(runningSum(new int[]{3, 1, 2, 10, 1})));
    }

    private static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
