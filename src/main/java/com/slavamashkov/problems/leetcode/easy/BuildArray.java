package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

/**
 * <h3>1920. Build Array from Permutation</h3>
 *
 * <p>Given a <b>zero-based permutation</b> {@code nums} (<b>0-indexed</b>), build an array {@code ans}
 * of the <b>same length</b> where {@code ans[i] = nums[nums[i]]} for each {@code 0 <= i < nums.length}
 * and return it.</p>
 *
 * <p>A <b>zero-based permutation</b> {@code nums} is an array of <b>distinct</b> integers from {@code 0}
 * to {@code nums.length - 1} (<b>inclusive</b>).</p>
 *
 * <p><b>Follow-up:</b> Can you solve it without using an extra space (i.e., {@code O(1)} memory)?</p>
 */

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
