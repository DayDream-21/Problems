package com.slavamashkov.problems.yandex.training_2_0.lesson6;

import java.util.Scanner;
import static java.lang.Math.pow;

public class EquationRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(searchRoot(a, b, c, d));
    }

    public static double searchRoot(int a, int b, int c, int d) {
        double lo = -1000, hi = 1000;
        double eps = 1e-5; // precision up to 5 decimal places

        if (a < 0) {
            a = -a;
            b = -b;
            c = -c;
            d = -d;
        }

        while (lo + eps < hi) {
            double mid = (lo + hi) / 2;
            double fmid = a * pow(mid, 3) + b * pow(mid, 2) + c * mid + d;

            if (fmid > 0) {
                hi = mid;
            } else {
                lo = mid;
            }
        }

        double root = (lo + hi) / 2;

        if (a < 0) {
            root = -root;
        }

        return root;
    }
}
