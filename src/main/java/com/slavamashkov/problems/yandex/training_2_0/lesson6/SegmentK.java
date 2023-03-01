package com.slavamashkov.problems.yandex.training_2_0.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class SegmentK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(x);
        int left = 0;
        int right = x[n - 1] - x[0];

        while (left < right) {
            int mid = (left + right) / 2;
            int cnt = 0;
            int maxRight = x[0] - 1;

            for (int nowX : x) {
                if (nowX > maxRight) {
                    cnt++;
                    maxRight = nowX + mid;
                }
            }

            if (cnt <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }
}