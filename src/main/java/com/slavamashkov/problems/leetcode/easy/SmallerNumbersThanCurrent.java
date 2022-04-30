package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <h3>1365. How Many Numbers Are Smaller Than the Current Number</h3>
 *
 * <p>Given the array {@code nums}, for each {@code nums[i]} find out how many numbers in the
 * array are smaller than it. That is, for each {@code nums[i]} you have to count the number
 * of valid {@code j's} such that {@code j != i} <b>and</b> {@code nums[j] < nums[i]}.</p>
 *
 * <p>Return the answer in an array.</p>
 */

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums1 = {8, 1, 2, 2, 3};
        int[] nums2 = {6, 5, 4, 8};
        int[] nums3 = {7, 7, 7, 7};

        System.out.println(Arrays.toString(naiveSmallerNumbersThanCurrent(nums1))); // [4, 0, 1, 1, 3]
        System.out.println(Arrays.toString(naiveSmallerNumbersThanCurrent(nums2))); // [2, 1, 0, 3]
        System.out.println(Arrays.toString(naiveSmallerNumbersThanCurrent(nums3))); // [0, 0, 0, 0]

        System.out.println(Arrays.toString(smallerNumbersThenCurrent(nums1)));
    }


    protected static int[] naiveSmallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                     count++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    protected static int[] smallerNumbersThenCurrent(int[] nums) {
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        int[] result = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sortedNums.length; i++) {
            if (!map.containsKey(sortedNums[i])) {
                map.put(sortedNums[i], i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }
}
