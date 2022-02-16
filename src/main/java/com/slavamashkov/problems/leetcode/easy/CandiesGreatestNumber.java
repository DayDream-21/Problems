package com.slavamashkov.problems.leetcode.easy;

import java.util.*;
import java.util.stream.Collectors;

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
