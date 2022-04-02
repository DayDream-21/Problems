package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * <h3>169. Majority Element</h3>
 *
 * <p>Given an array {@code nums} of size {@code n}, return <i>the majority element</i>.</p>
 *
 * <p>The majority element is the element that appears more than {@code ⌊n / 2⌋} times. You may assume that the
 * majority element always exists in the array.</p>
 * */

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElementBrute(nums));
        System.out.println(majorityElementBetter(nums));
        System.out.println(majorityElementFast(nums));
    }

    private static int majorityElementBrute(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        int majorityNumber = (int) Math.floor(n / 2);
        int result = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                if (map.get(num) > majorityNumber) {
                    result = num;
                }
            } else {
                map.put(num, 1);
            }
        }

        return result;
    }

    private static int majorityElementBetter(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // Boyer–Moore majority vote algorithm
    private static int majorityElementFast(int[] nums) {
        int counter = 1;
        int candidate = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (counter == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                counter++;
            } else {
                counter--;
            }
        }

        return candidate;
    }
}