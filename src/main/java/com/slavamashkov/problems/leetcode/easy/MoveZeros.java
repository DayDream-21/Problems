package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

/**
 * <h3>283. Move Zeroes</h3>
 *
 * <p>Given an integer array {@code nums}, move all {@code 0}'s to the end of it while maintaining the relative
 * order of the non-zero elements.</p>
 *
 * <p><b>Note</b> that you must do this in-place without making a copy of the array.</p>
 *
 */

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

    protected static void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
