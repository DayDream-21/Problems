package com.slavamashkov.problems.tinkoff.contest_12_02_2023;

import java.util.Arrays;
import java.util.Scanner;

public class Cpu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            freq[i] = sc.nextInt();
        }
        Arrays.sort(freq);
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += freq[i];
        }
        int l = 1, r = freq[n - 1];
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (sum <= mid * (n - 2)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(ans * (n - 1) + sum);
    }
}
