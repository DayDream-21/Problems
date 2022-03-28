package com.slavamashkov.problems.leetcode.medium;

import java.util.Arrays;

/**
 * <h3>167. Two Sum II - Input Array Is Sorted</h3>
 *
 * <p>Given a <b>1-indexed</b> array of integers {@code numbers} that is already <b>sorted in non-decreasing
 * order</b>, find two numbers such that they add up to a specific {@code target} number. Let these two numbers be
 * {@code numbers[index1]} and {@code numbers[index2]} where {@code 1 <= index1 < index2 <= numbers.length}.</p>
 *
 * <p>Return <i>the indices of the two numbers</i>, {@code index1} <i>and</i> {@code index2}, <i><b>added by one</b>
 * as an integer array</i> {@code [index1, index2]} <i>of length 2</i>.</p>
 *
 * <p>The tests are generated such that there is <b>exactly one solution</b>. You <b>may not</b> use the same
 * element twice.</p>
 *
 * <p>Your solution must use only constant extra space.</p>
 */

public class TwoSum2 {
    public static void main(String[] args) {
        int[] numbers1 = {2, 7, 11, 15};
        int[] numbers2 = {2, 3, 4};
        int[] numbers3 = {-1, 0};

        int target1 = 9;
        int target2 = 6;
        int target3 = -1;

        System.out.println(Arrays.toString(twoSum(numbers1, target1)));
        System.out.println(Arrays.toString(twoSum(numbers2, target2)));
        System.out.println(Arrays.toString(twoSum(numbers3, target3)));
    }

    protected static int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        if (numbers.length == 2) {
            return new int[] {1, 2};
        }

        while (leftPointer < rightPointer) {
            if (numbers[leftPointer] + numbers[rightPointer] > target) {
                rightPointer--;
            } else if (numbers[leftPointer] + numbers[rightPointer] < target) {
                leftPointer++;
            } else {
                return new int[] {leftPointer + 1, rightPointer + 1};
            }
        }

        return null;
    }
}
