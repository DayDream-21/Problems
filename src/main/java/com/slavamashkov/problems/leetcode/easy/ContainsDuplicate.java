package com.slavamashkov.problems.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate1(arr));
    }

    private static boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }

        return false;
    }
}
