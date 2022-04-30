package com.slavamashkov.problems.leetcode.easy;

import java.util.*;

/**
 * <h3>1431. Kids With the Greatest Number of Candies</h3>
 *
 * <p>There are {@code n} kids with candies. You are given an integer array {@code candies}, where each
 * {@code candies[i]} represents the number of candies the {@code ith} kid has, and an integer {@code extraCandies},
 * denoting the number of extra candies that you have.</p>
 *
 * <p>Return a boolean array {@code result} of length {@code n}, where {@code result[i]} is {@code true} if, after
 * giving the {@code ith} kid all the {@code extraCandies}, they will have the <b>greatest</b> number of candies among
 * all the kids, or {@code false} otherwise.</p>
 *
 * <p>Note that <b>multiple</b> kids can have the <b>greatest</b> number of candies.</p>
 */

public class CandiesGreatestNumber {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extra = 3;

        System.out.println(kidsWithCandies(candies, extra));
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int max = 0;

        for (int i : candies) {
            max = Math.max(max, i);
        }

        for (int candy : candies) {
            if ((candy + extraCandies) >= max) {
                ans.add(Boolean.TRUE);
            } else {
                ans.add(Boolean.FALSE);
            }
        }
        return ans;
    }
}
