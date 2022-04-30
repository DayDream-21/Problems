package com.slavamashkov.problems.leetcode.easy;

/**
 * <h3>1672. Richest Customer Wealth</h3>
 *
 * <p>You are given an {@code m x n} integer grid {@code accounts} where {@code accounts[i][j]} is the amount
 * of money the {@code ith} customer has in the {@code jth} bank. Return <i>the <b>wealth</b> that the richest customer has</i>.</p>
 *
 * <p>A customer's <b>wealth</b> is the amount of money they have in all their bank accounts. The richest customer is the
 * customer that has the maximum <b>wealth</b>.</p>
 */

public class RichestCustomerWealth {
    public static void main(String[] args) {
        // 6
        System.out.println(maximumWealth(new int[][]{
                {1, 2, 3},
                {3, 2, 1}
        }));
        // 10
        System.out.println(maximumWealth(new int[][]{
                {1, 5},
                {7, 3},
                {3, 5}
        }));
    }

    /**
     * <ul>
     *     <li>
     *          Time complexity: O(M * N)
     *
     *          <p>For each of the M customers, we need to iterate over all N banks to find the sum of
     *          wealth. Inside each iteration, operations like addition or finding maximum take O(1) time.
     *          Hence, the total time complexity is O(M * N).</p>
     *     </li>
     *     <li>
     *         Space complexity: O(1)
     *     </li>
     * </ul>
     *
     * @param accounts 2d array where each line is customer and each column is wealth in single bank
     * @return account with max wealth
     */

    private static int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        int customer_wealth;
        int banks = accounts[0].length;

        for (int[] account : accounts) {
            customer_wealth = 0;

            for (int j = 0; j < banks; j++) {
                customer_wealth += account[j];
            }

            if (customer_wealth >= max_wealth) {
                max_wealth = customer_wealth;
            }
        }
        return max_wealth;
    }
}
