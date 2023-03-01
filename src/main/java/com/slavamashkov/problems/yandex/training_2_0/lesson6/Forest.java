package com.slavamashkov.problems.yandex.training_2_0.lesson6;

import java.util.Scanner;

public class Forest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int k = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();

        int days = getDays(a, k, b, m, x);

        System.out.println(days);
    }

    public static int getDays(int a, int k, int b, int m, int x) {
        int dayCount = 0;

        while (x > 0) {
            dayCount++;

            if (dayCount % k != 0 && dayCount % m != 0) {
                x = x - (a + b);
            } else if (dayCount % k != 0) {
                x = x - b;
            } else if (dayCount % m != 0) {
                x = x - a;
            } else {

            }
        }

        return dayCount;
    }
}
