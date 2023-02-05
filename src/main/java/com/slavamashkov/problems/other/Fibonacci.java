package com.slavamashkov.problems.other;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int f = 50;
        long[] memo = new long[f + 1];
        // Fill array with -1 to indicate which fib-number we already calculate
        Arrays.fill(memo, -1);

        System.out.println(fibSlow(20));
        System.out.println(fibMemo(f, memo));
        System.out.println(fibFast(1000));
    }

    private static long fibSlow(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibSlow(n - 1) + fibSlow(n - 2);
        }
    }

    private static long fibMemo(int n, long[] memo) {
        // Check if we have calculated n-number before
        if (memo[n] != -1) {
            return memo[n];
        }
        // If not, then we calculate it and add in array
        if (n <= 1) {
            return n;
        } else {
            memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        }

        return memo[n];
    }

    private static long fibFast(int n) {
        long[] fib = new long[n + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
}
