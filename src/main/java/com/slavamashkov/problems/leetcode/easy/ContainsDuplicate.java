package com.slavamashkov.problems.leetcode.easy;

import java.util.*;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate1(arr));
        System.out.println(removeDuplicates(Arrays.stream(arr).boxed().collect(Collectors.toList())));
    }


    /**
     * Given an integer array nums, return true if any value appears
     * at least twice in the array, and return false if every element
     * is distinct.
     * */
    private static boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Given an integer array nums and an integer k, return true if there are two distinct
     * indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
     * */
    private static boolean containsDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (map.containsKey(current) && (i - map.get(current)) <= k) {
                return true;
            } else {
                map.put(current, i);
            }
        }

        return false;
    }

    protected static List<Integer> removeDuplicates(List<Integer> input) {
        Set<Integer> lhs = new LinkedHashSet<>(input);

        return new ArrayList<>(lhs);
    }
}
