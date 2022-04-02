package com.slavamashkov.problems.leetcode.medium;

import java.util.Arrays;

/**
 * <h3>189. Rotate Array</h3>
 *
 * <p>Given an array, rotate the array to the right by {@code k} steps, where {@code k} is non-negative.</p>
 */

public class RotateArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {-1, -100, 3, 99};

        int k1 = 3;
        int k2 = 2;

        constantMemoryRotate(nums1, k1);
        constantMemoryRotate(nums2, k2);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }



    protected static void constantMemoryRotate(int[] nums, int k) {
        int n = nums.length;

        if (n <= 1 || k == 0 || k == n) {
            return;
        }

        if (k > n) {
            k %= n;
        }

        int[] tmp = new int[k];

        for (int i = 0; i < k; i++){
            tmp[i] = nums[n - k + i];
        }

        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = tmp[i];
        }
    }
}
