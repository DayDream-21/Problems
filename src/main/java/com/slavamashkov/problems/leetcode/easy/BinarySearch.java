package com.slavamashkov.problems.leetcode.easy;

/**
 * <h3>704. Binary Search</h3>
 *
 * <p>Given an array of integers {@code nums} which is sorted in ascending order,
 * and an integer {@code target}, write a function to search {@code target} in
 * {@code nums}. If {@code target} exists, then return its index. Otherwise, return
 * {@code -1}.</p>
 *
 * <p>You must write an algorithm with {@code O(log n)} runtime complexity.</p>
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target1 = 9;
        int target2 = 2;

        System.out.println(search(nums, target1));
        System.out.println(search(nums, target2));
    }

    protected static int search(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int targetPointer;

        while (leftPointer <= rightPointer) {
            targetPointer = (leftPointer + rightPointer) / 2;

            if (nums[targetPointer] == target) {
                return targetPointer;
            }

            if (nums[targetPointer] > target) {
                rightPointer = targetPointer - 1;
            } else if (nums[targetPointer] < target) {
                leftPointer = targetPointer + 1;
            }
        }

        return -1;
    }
}
