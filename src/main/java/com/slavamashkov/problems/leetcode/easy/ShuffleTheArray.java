package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

/**
 * <h3>1470. Shuffle the Array</h3>
 *
* <p>Given the array {@code nums} consisting of {@code 2n} elements in the form {@code [x1,x2,...,xn,y1,y2,...,yn]}.</p>
*
* <p><i>Return the array in the form</i> {@code [x1,y1,x2,y2,...,xn,yn]}.</p>
* */

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7}; // 2 3 5 4 1 7

        System.out.println(Arrays.toString(shuffle(nums, nums.length / 2)));
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                result[i] = nums[i / 2];
            } else {
                result[i] = nums[n + (i / 2)];
            }
        }
        return result;
    }
}
