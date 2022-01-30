package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};

        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    private static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];


        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
