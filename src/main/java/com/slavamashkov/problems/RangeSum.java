package com.slavamashkov.problems;

public class RangeSum {
    static int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static final int[] prefs;

    static {
        prefs = new int[ints.length];

        prefs[0] = ints[0];

        for (int i = 1; i < prefs.length; i++) {
            prefs[i] = prefs[i - 1] + ints[i];
        }
    }

    public static void main(String[] args) {
        System.out.println(naiveRangeSum(ints, 0, 4)); // 1+2+3+4+5=15
        System.out.println(fastRangeSum(0, 4)); // 15
    }

    protected static int naiveRangeSum(int[] ints, int l, int r) {
        int result = 0;

        for (int i = l; i < r + 1; i++) {
            result += ints[i];
        }

        return result;
    }

    protected static int fastRangeSum(int l, int r) {
        return prefs[r - l];
    }

}
