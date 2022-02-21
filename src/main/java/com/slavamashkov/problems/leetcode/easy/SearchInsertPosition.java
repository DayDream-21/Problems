package com.slavamashkov.problems.leetcode.easy;

/**
 * Given a sorted array of distinct integers and a target value, return
 * the index if the target is found. If not, return the index where it
 * would be if it were inserted in order.
 * <p>
 * You must write an algorithm with {@code O(log n)} runtime complexity.
 * */

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 4;

        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] nums, int target) {
        int left_pointer = 0;
        int right_pointer = nums.length - 1;

        while (left_pointer <= right_pointer) {
            int mid_pointer = (left_pointer + right_pointer) / 2;

            if (nums[mid_pointer] == target) {
                return mid_pointer;
            } else if (nums[mid_pointer] > target) {
                right_pointer = mid_pointer - 1;
            } else {
                left_pointer = mid_pointer + 1;
            }
        }

        return left_pointer;
    }
}

