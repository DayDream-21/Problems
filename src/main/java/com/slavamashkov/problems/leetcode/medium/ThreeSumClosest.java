package com.slavamashkov.problems.leetcode.medium;

import java.util.Arrays;

/**
 * <h3>16. 3Sum Closest</h3>
 *
 * <p>Given an integer array {@code nums} of length {@code n} and an integer {@code target}, find three integers
 * in {@code nums} such that the sum is closest to {@code target}.</p>
 *
 * <p>Return <i>the sum of the three integers</i>.</p>
 *
 * <p>You may assume that each input would have exactly one solution.</p>
 */

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums1 = {-1, 2, 1, -4};
        int[] nums2 = {0, 0, 0};

        int target1 = 2;
        int target2 = 0;

        System.out.println(threeSumClosest(nums1, target1)); // 2
        System.out.println(threeSumClosest(nums2, target2)); // 0
    }

    protected static int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int a_pointer = i + 1;
            int b_pointer = nums.length - 1;

            while (a_pointer < b_pointer) {
                int currentSum = nums[i] + nums[a_pointer] + nums[b_pointer];

                if (currentSum > target) {
                    b_pointer--;
                } else {
                    a_pointer++;
                }

                if (Math.abs(target - currentSum) < Math.abs(target - result)) {
                    result = currentSum;
                }
            }
        }
        return result;
    }
}
