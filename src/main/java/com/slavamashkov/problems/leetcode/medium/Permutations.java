package com.slavamashkov.problems.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>46. Permutations</h3>
 *
 * <p>Given an array {@code nums} of distinct integers, return <i>all the possible permutations</i>. You can return
 * the answer in <b>any order</b>.</p>
 */
public class Permutations {
    public static void main(String[] args) {
        System.out.println(permuteBacktrack(new int[]{1, 2, 3}));
        System.out.println(permuteBacktrack(new int[]{0, 1}));
        System.out.println(permuteBacktrack(new int[]{1}));

        System.out.println(permuteDFS(new int[]{1, 2, 3}));
        System.out.println(permuteDFS(new int[]{0, 1}));
        System.out.println(permuteDFS(new int[]{1}));
    }

    /**
     * @param nums array of ints
     * @return list of all possible permutations
     *
     * <ul>
     *     <li>
     *          Time complexity: O(n! / (n – n)!)
     *          <p>Permutation formula (no repetitions), where n is length of nums</p>
     *     </li>
     *     <li>
     *         Space complexity: O(n)
     *         <p>Recursion depth is determined by the number of digits in the array</p>
     *     </li>
     * </ul>
     */
    private static List<List<Integer>> permuteBacktrack(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        backtrack(list, new ArrayList<>(), nums);

        return list;
    }

    private static List<List<Integer>> permuteDFS(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        dfs(new ArrayList<>(), new boolean[nums.length], list, nums);

        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        // if tempList contains same elements amount as nums, then we can add it in result list
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int num : nums) {
                // element already exists, skip
                if (tempList.contains(num)) {
                    continue;
                }
                tempList.add(num);

                backtrack(list, tempList, nums);

                tempList.remove(tempList.size() - 1);
            }
        }
    }

    private static void dfs(List<Integer> path, boolean[] used, List<List<Integer>> res, int[] nums) {
        if (path.size() == used.length) {
            // make a deep copy since otherwise we'd be appended the same list over and over
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < used.length; i++) {
            // skip used nums
            if (used[i]) {
                continue;
            }
            // add letter to permutation, mark letter as used
            path.add(nums[i]);

            used[i] = true;

            dfs(path, used, res, nums);
            // remove letter from permutation, mark letter as unused
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
