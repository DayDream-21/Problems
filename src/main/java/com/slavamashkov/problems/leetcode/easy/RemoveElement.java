package com.slavamashkov.problems.leetcode.easy;

/**
 * <h3>27. Remove Element</h3>
 *
 * <p>Given an integer array {@code nums} and an integer {@code val}, remove all occurrences of {@code val} in
 * {@code nums} <b>in-place</b>. The relative order of the elements may be changed.</p>
 *
 * <p>Since it is impossible to change the length of the array in some languages, you must instead have the result
 * placed in the <b>first part</b> of the array {@code nums}. More formally, if there are k elements after removing
 * the duplicates, then the first {@code k} elements of {@code nums} should hold the final result. It does not matter
 * what you leave beyond the first {@code k} elements.</p>
 *
 * <p>Return {@code k} <i>after placing the final result in the first</i> {@code k} <i>slots of</i> {@code nums}.</p>
 *
 * <p>Do <b>not</b> allocate extra space for another array. You must do this by <b>modifying the input array
 * in-place</b> with O(1) extra memory.</p>
 */

public class RemoveElement {
    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 2, 3, 0, 4, 2};
        int range = removeElement(ints, 2);
        System.out.println(range);

        for (int i = 0; i < range; i++) {
            System.out.print(ints[i]);
        }
    }

    private static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }

        return pointer;
    }
}
