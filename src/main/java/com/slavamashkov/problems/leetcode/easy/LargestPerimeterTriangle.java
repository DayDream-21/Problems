package com.slavamashkov.problems.leetcode.easy;

import java.util.Arrays;

/**
 * <h3>976. Largest Perimeter Triangle</h3>
 *
 * <p>Given an integer array {@code nums}, return <i>the largest perimeter of a triangle with a non-zero area, formed
 * from three of these lengths</i>. If it is impossible to form any triangle of a non-zero area, return {@code 0}.</p>
 */

public class LargestPerimeterTriangle {
    public static void main(String[] args) {

    }

    protected static int largestPerimeter(int[] A) {
        Arrays.sort(A);

        for (int i = A.length - 3; i >= 0; --i) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                return A[i] + A[i + 1] + A[i + 2];
            }
        }

        return 0;
    }
}
