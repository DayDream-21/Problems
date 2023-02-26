package com.slavamashkov.problems.yandex.training_2_0.lesson5;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create the prefix sum array
        int[] prefixSum = getPrefixSum(arr);

        // Answer the queries
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(sumInRange(prefixSum, l, r));
        }
    }

    public static int sumInRange(int[] prefixSum, int l, int r) {
        return prefixSum[r] - prefixSum[l - 1];
    }

    public static int[] getPrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length + 1];

        for (int i = 1; i <= arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }

        return prefixSum;
    }
}
