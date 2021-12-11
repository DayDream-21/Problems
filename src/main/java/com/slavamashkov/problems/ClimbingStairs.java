package com.slavamashkov.problems;

import java.util.HashMap;
import java.util.Map;

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
