package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

/**
 * <h3>977. Squares of a Sorted Array</h3>
 *
 * Given an integer array {@code nums} sorted in <b>non-decreasing</b> order,
 * return <i>an array of <b>the squares of each number</b> sorted in non-decreasing order.</i>
 */

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(streamSortedSquares(nums)));
        System.out.println(Arrays.toString(twoPointersSortedSquares(nums)));
    }

    protected static int[] streamSortedSquares(int[] nums) {
        return Arrays.stream(nums)
                .map(i -> (int) Math.pow(i, 2))
                .sorted()
                .toArray();
    }

    protected static int[] twoPointersSortedSquares(int[] nums) {
        if(nums == null || nums.length == 0) { // Edge case
            return new int[0];
        }

        int[] result = new int[nums.length];
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int index = nums.length - 1;

        while (leftPointer <= rightPointer) {
            if (Math.abs(nums[leftPointer]) < Math.abs(nums[rightPointer])) {
                result[index] = (int) Math.pow(nums[rightPointer], 2);

                index--;
                rightPointer--;
            } else {
                result[index] = (int) Math.pow(nums[leftPointer], 2);

                index--;
                leftPointer++;
            }
        }

        return result;
    }
}
