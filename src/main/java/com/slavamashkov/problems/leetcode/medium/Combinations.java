package com.slavamashkov.problems.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>77. Combinations</h3>
 *
 * <p>Given two integers {@code n} and {@code k}, return <i>all possible combinations of</i> {@code k} <i>numbers
 * out of the range {@code [1, n]}</i>.</p>
 *
 * <p>You may return the answer in <b>any order</b>.</p>
 */

public class Combinations {
    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

    /**
     * @param n upper bound of range [1, n]
     * @param k amount of numbers in single combination
     * @return list of all possible combinations
     *
     * <ul>
     *     <li>
     *          Time complexity: O((n!)/((n - k)! * k!))
     *          <p>Combination formula</p>
     *     </li>
     *     <li>
     *         Space complexity: O(k)
     *         <p>Combination can be added in resultList when k = 0, each time we invoke backtrack method we
     *         decrement k by 1 (if k = 2, then we can decrement it 2 times)</p>
     *     </li>
     * </ul>
     */
    private static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<>();

        backtrack(combs, new ArrayList<>(), 1, n, k);

        return combs;
    }

    private static void backtrack(List<List<Integer>> resultList, List<Integer> tempList, int start, int n, int k) {
        if (k == 0) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i <= n - k + 1; i++) {
            tempList.add(i);
            backtrack(resultList, tempList, i + 1, n, k - 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
