package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

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
