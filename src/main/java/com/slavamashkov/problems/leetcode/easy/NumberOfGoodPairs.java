package com.slavamashkov.problems.leetcode.easy;

import java.util.HashMap;

/**
 * <h3>1512. Number of Good Pairs</h3>
 *
 * <p>Given an array of integers {@code nums}, return <i>the number of <b>good pairs</b></i>.</p>
 *
 * <p>A pair {@code (i, j)} is called <i>good</i> if {@code nums[i] == nums[j]} and {@code i < j}.</p>
 */

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        // 4
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        // 6
        System.out.println(numIdenticalPairs(new int[]{1, 1, 1, 1}));
        // 0
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3}));
    }

    private static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int ans = 0;

        for (int i : nums) {
            int count = hm.getOrDefault(i, 0);
            ans += count;
            hm.put(i, count + 1);
        }


        return ans;
    }
}
