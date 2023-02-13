package com.slavamashkov.problems.yandex.training_2_0.lesson2;

import java.util.Scanner;

public class Bench {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int k = sc.nextInt();
        boolean[] a = new boolean[k + 1];
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            a[n] = true;
        }
        if (L % 2 != 0 && a[L / 2]) {
            System.out.println(L / 2);
            return;
        }
        for (int i = (L - 1) / 2; i >= 0; i--) {
            if (a[i]) {
                System.out.print(i + " ");
                break;
            }
        }
        for (int i = L / 2; i < L; i++) {
            if (a[i]) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
