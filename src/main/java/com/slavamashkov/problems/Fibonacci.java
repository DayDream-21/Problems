package com.slavamashkov.problems;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibSlow(40));
        System.out.println(fibFast(1000));
    }

    private static long fibSlow(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibSlow(n - 1) + fibSlow(n - 2);
        }
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
