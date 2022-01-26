package com.slavamashkov.problems;

import java.util.ArrayList;

public class BackpackProblem {
    public static void main(String[] args) {
        int[] weights = {3, 4, 5, 8, 9};
        int[] prices = {1, 6, 4, 7, 6};
        int maxWeight = 13;

        extracted(weights, prices, maxWeight);
    }

    private static void extracted(int[] weights, int[] prices, int maxWeight) {
        int count = weights.length;
        int[][] a = new int[count + 1][maxWeight + 1];

        for (int k = 0; k <= count; k++) {
            for (int s = 0; s <= maxWeight; s++) {
                if (k == 0 || s == 0) {
                    a[k][s] = 0;
                } else {
                    if (s >= weights[k - 1]) {
                        a[k][s] = Math.max(a[k - 1][s], a[k - 1][s - weights[k - 1]] + prices[k - 1]);
                    } else {
                        a[k][s] = a[k - 1][s];
                    }
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        traceResult(a, weights, count, maxWeight, result);

        System.out.println("Optimal contents of the backpack: ");
        for (Integer r : result) {
            System.out.println(r);
        }
    }

    private static void traceResult(int[][] a, int[] weight, int k, int s, ArrayList<Integer> result) {
        if (a[k][s] == 0) {
            return;
        }

        if (a[k - 1][s] == a[k][s]) {
            traceResult(a, weight, k - 1, s, result);
        } else {
            traceResult(a, weight, k - 1, s - weight[k - 1], result);
            result.add(0, k);
        }
    }
}
