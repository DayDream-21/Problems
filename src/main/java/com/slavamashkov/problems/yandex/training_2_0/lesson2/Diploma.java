package com.slavamashkov.problems.yandex.training_2_0.lesson2;

import java.util.Scanner;

public class Diploma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(calculateTime(n, a));
    }

    public static int calculateTime(int n, int[] a) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (a[i] > max) {
                max = a[i];
            }
        }

        return sum - max;
    }
}
