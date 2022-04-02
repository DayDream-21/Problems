package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

/**
 * <h3>26. Remove Duplicates from Sorted Array</h3>
 *
 * <p>Given an integer array {@code nums} sorted in <b>non-decreasing order</b>, remove the duplicates <b>in-place</b>
 * such that each unique element appears only <b>once</b>. The <b>relative order</b> of the elements should be kept
 * the <b>same</b>.</p>
 *
 * <p>Since it is impossible to change the length of the array in some languages, you must instead have the result
 * be placed in the <b>first</b> part of the array {@code nums}. More formally, if there are k elements after removing
 * the duplicates, then the first {@code k} elements of {@code nums} should hold the final result. It does not matter
 * what you leave beyond the first {@code k} elements.</p>
 *
 * <p>Return {@code k} <i>after placing the final result in the first</i> {@code k} <i>slots of</i> {@code nums}.</p>
 *
 * <p>Do <b>not</b> allocate extra space for another array. You must do this by <b>modifying the input array
 * in-place</b> with O(1) extra memory.</p>
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] ints = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(new RemoveDuplicates().removeDuplicates(ints));
        System.out.println(Arrays.toString(ints));
    }

    public int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i = 0; i < nums.length - 1; i++) {
           if (nums[i] != nums[i + 1]) {
               nums[index++] = nums[i + 1];
           }
        }

        return index;
    }
}
