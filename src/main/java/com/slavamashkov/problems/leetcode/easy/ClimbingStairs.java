package com.slavamashkov.problems.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>70. Climbing Stairs</h3>
 *
 * <p>You are climbing a staircase. It takes {@code n} steps to reach the top.</p>
 *
 * <p>Each time you can either climb {@code 1} or {@code 2} steps. In how many distinct ways can you climb to
 * the top?</p>
 */

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }

    private static final Map<Integer, Integer> map = new HashMap<>();

    private static int climbStairs(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("n < 0");
        } else if (n == 0 || n == 1 || n == 2) {
            return n;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int result = climbStairs(n - 1) + climbStairs(n - 2);

        map.put(n, result);

        return result;
    }
}
