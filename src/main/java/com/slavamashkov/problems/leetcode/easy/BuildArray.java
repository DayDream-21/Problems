package com.slavamashkov.problems.leetcode.easy;

/*
* Given a zero-based permutation nums (0-indexed),
* build an array ans of the same length where
* ans[i] = nums[nums[i]] for each 0 <= i < nums.length
* and return it.
*
* Follow-up: Can you solve it without using an extra space
* (i.e., O(1) memory)?
* */

import java.util.Arrays;

public class BuildArray {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        System.out.println(Arrays.toString(buildArray(nums)));
    }

    // Time complexity O(n), n - length of input array
    // Space complexity O(1)
    private static int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            System.out.println("i = " + i);
            System.out.println(Arrays.toString(nums));
            nums[i] = n * (nums[nums[i]] % n) + nums[i];
            System.out.println(Arrays.toString(nums));
        }

        for(int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }
}
